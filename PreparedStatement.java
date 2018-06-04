
package JDBCExcel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreparedStatement extends BasePreparedStatement {
	
	ExcelReader excel;
	
	Connection connection;
	String query;
	List<Object> parameters;
	Statement statement;
	ResultSet resultSet;
	List<Object> resultSetRow = new ArrayList<>();
	
	DatabaseMetaData dbmd;
	SQL sql = new SQL();
	Map<String,String> tableCols = new HashMap<>();
	List<String> queryCols = new ArrayList<>();
	Integer rowFrom;
	Integer rowTo;
	Integer rowNumber = 0;
	Integer limit = Integer.MAX_VALUE;
	Integer count = 0;
	Integer colFrom;
	Integer colTo;
	
	public PreparedStatement (Connection con,String stmt) {
		
		//System.err.println ("PreparedStatement " + stmt);
		
		this.connection = con;
		this.query = stmt;
		this.parameters = new ArrayList<>();
		}
	
	@Override
	public void close() {
		this.resultSet = null;
		this.sql = null;
		this.tableCols = null;
		this.queryCols = null;
		try {
			excel.closeSheet();
			}
		catch (Exception ex) {
			System.err.println ("ExcelReader.close(): " + ex.getMessage());
			}
		}
	
	@Override
	public boolean execute() throws SQLException {
		this.resultSet = executeQuery();
		return this.resultSet != null;
		}	
	
	@Override
	public ResultSet executeQuery() throws SQLException {
		
		// Parse the query.
		sql.parse (this.query);		
		List<String> tbl = sql.getTables();
		
		// Find the table worksheet.
		String schemaName = "";
		String tableName = tbl.get(0);
		if (tableName.contains(".")) {
			String[] parts = tableName.split("[.]");
			schemaName = parts[0];
			tableName = parts[1];
			}
		schemaName = Util.unQuote(schemaName);
		tableName = Util.unQuote(tableName);
		
		// Get the named sheet as a table.
		excel = connection.excel;
		try {
			excel.openSheet (tableName);
			}
		catch (Exception ex) {
			throw new SQLException ("Table [" + tableName + "] not found.");
			}
		
		// Get the columns for the FROM table.
		List<String> validCols = new ArrayList<>();
		try {
			Map<String,String> row = excel.getRow();
			for (Map.Entry<String,String> entry: row.entrySet()) {
				String name = Util.unQuote(entry.getValue());
				String ref = excel.getColumnRef(entry.getKey());
				validCols.add (name);
				tableCols.put (name,ref);
				}
			}
		catch (Exception ex) {
			throw new SQLException ("Error reading column headings.");
			}
		
		// Validate and expand column list.
		sql.validate (validCols);
		this.queryCols = sql.getColumnList();
		this.limit = sql.getLimit();
		this.count = 0;
			
		// Add the column name or alias as the result set label.
		ResultSet rs = new ResultSet (this);
		for (String col: queryCols) {
			String label = sql.getColumnLabel(col);
			label = Util.unQuote(label);		
			rs.addColumn (label);
			}
		
		// Return the result set.
		return rs;
		}
	
	@Override
	public ResultSet getResultSet() {
		return resultSet;
		}
	
	//--------------------------------------------------------------------------
	//	next()						Return next row of values.
	//--------------------------------------------------------------------------
	
	public List<Object> next() {
		
		Map<String,String> row = null;
		
		// Get the next row from Excel
		
		try {
			row = excel.getRow();
			}
		catch (Exception ex) {
			System.err.println ("ExcelReader.next(): " + ex.getMessage());
			return null;
			}
		
		// Consider a blank line to be end.
		
		if (row == null) return null;
		
		// Return NULL if we've passed the query limit.
		
		if (count >= limit) return null;
		++ count;
		
		// Set up the return values.
		
		resultSetRow.clear();
		for (String colName: queryCols) {
			if (colName.startsWith("'")) {
				colName = Util.unQuote(colName);
				resultSetRow.add (colName);
				}
			else {
				colName = Util.unQuote(colName);
				String colRef = tableCols.get(colName);
				String value = row.getOrDefault(colRef, null);
				//System.err.println (colName + ' ' + colRef + ' ' + value);
				resultSetRow.add (value);
				}
			}
		
		return resultSetRow;
		}

	@Override
	public void setFetchSize (int i) {
		}
	
	@Override 
	public void setObject (int parameterIndex,Object object) {
		parameters.add (object);
		}
	
}
