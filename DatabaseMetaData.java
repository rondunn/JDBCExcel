
package JDBCExcel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatabaseMetaData extends BaseDatabaseMetaData {
	
	protected Connection connection;
	protected ResultSet rs;
	protected Integer rowIndex;
	protected List<List<Object>> rows = new ArrayList<>();
	
	/**
	 * Constructor
	 * @param con Database connection
	 */
	
	public DatabaseMetaData (Connection con) {
		
		this.connection = con;
		
		}
	
	/**
	 * Get the next row from a metadata ResultSet.
	 * @return 
	 */
	
	public List<Object> next() {
		if (rowIndex < rows.size()) {
			return rows.get(rowIndex++);
			}
		return null;
		}
	
	/**
	 * Return a list of catalogs for this DBMS. This driver treats a spreadsheet
	 * file as a database.
	 * @return 
	 */
	
	@Override
	public ResultSet getCatalogs() {
		
		rows.clear();
		rowIndex = 0;
		
		rs = new ResultSet(this);
		rs.addColumn ("TABLE_CAT");
		
		File dir = new File(connection.getServer());
		File[] files = dir.listFiles((d, name) -> name.endsWith(".xlsx"));

		for (File f: files) {
			List<Object> row = new ArrayList<>();
			row.add (f.getName());
			rows.add (row);
			}
		
		return rs;
		}
	
	/**
	 * Return a list of columns for a schema/table combination. Columns are
	 * mapped from the spreadheet columns for a workbook.
	 * @param catalog
	 * @param schemaPattern
	 * @param tableNamePattern
	 * @param columnNamePattern
	 * @return 
	 */
	
	@Override
    public ResultSet getColumns (String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
		
		rows.clear();
		rowIndex = 0;		
		String databaseName = connection.getDatabase();
		String schemaName = "Excel";
		
		String sx = null;
		if (tableNamePattern != null) sx = Util.sqlLikeToRegex(schemaPattern);
		String rx = null;
		if (tableNamePattern != null) rx = Util.sqlLikeToRegex(tableNamePattern);
		String cx = null;
		if (columnNamePattern != null) cx = Util.sqlLikeToRegex(columnNamePattern);
		
		try {
			
			ExcelReader excel = this.connection.excel;
			List<String> sheetNames = excel.getSheetNames();
			for (String sheetName: sheetNames) {
				
				Boolean tableMatch = true;
				if (sx != null && !schemaName.matches(sx)) tableMatch = false;
				if (rx != null && !sheetName.matches(rx)) tableMatch = false;
				
				if (tableMatch == true) {
					
					excel.openSheet (sheetName);
					Map<String,String> sheetRow = excel.getRow();
					Integer colCount = 1;
					for (Map.Entry<String,String> entry: sheetRow.entrySet()) {

						String columnName = entry.getValue();
						String columnRef = excel.getColumnRef(entry.getKey());
					
						int type = java.sql.Types.VARCHAR;
						String typeName = "VARCHAR";
						int colSize = 255;
						int decimals = 0;
							
						List<Object> row = new ArrayList<>();
						row.add (databaseName);
						row.add (schemaName);
						row.add (sheetName);
						row.add (columnRef);		// Extension
						row.add (columnName);
						row.add (type);
						row.add (typeName);
						row.add (colSize);
						row.add (null);
						row.add (decimals);
						row.add (10);
						row.add (DatabaseMetaData.columnNullable);
						row.add ("");
						row.add (null);
						row.add (null);
						row.add (null);
						row.add (colSize);
						row.add (colCount++);
						row.add ("YES");
						row.add (null);
						row.add (null);
						row.add (null);
						row.add (null);
						row.add ("");
						row.add ("");
						rows.add (row);
						
						}
					excel.closeSheet();
					}
				}
			}
		catch (Exception ex) {
			System.err.println (ex.getMessage());
			return null;
			}
		
        rs = new ResultSet(this);
        rs.addColumn ("TABLE_CAT");
        rs.addColumn ("TABLE_SCHEM");
        rs.addColumn ("TABLE_NAME");
		rs.addColumn ("COLUMN_REF");
        rs.addColumn ("COLUMN_NAME");    
        rs.addColumn ("DATA_TYPE");
        rs.addColumn ("TYPE_NAME");
        rs.addColumn ("COLUMN_SIZE");
        rs.addColumn ("BUFFER_LENGTH");
        rs.addColumn ("DECIMAL_DIGITS");
        rs.addColumn ("NUM_PREC_RADIX");
        rs.addColumn ("NULLABLE");
        rs.addColumn ("REMARKS");
        rs.addColumn ("COLUMN_DEF");
        rs.addColumn ("SQL_DATA_TYPE");
        rs.addColumn ("SQL_DATETIME_SUB");
        rs.addColumn ("CHAR_OCTET_LENGTH");
        rs.addColumn ("ORDINAL_POSITION");
        rs.addColumn ("IS_NULLABLE");
        rs.addColumn ("SCOPE_CATALOG");
        rs.addColumn ("SCOPE_SCHEMA");
        rs.addColumn ("SCOPE_TABLE");
        rs.addColumn ("SOURCE_DATA_TYPE");
        rs.addColumn ("IS_AUTOINCREMENT");
        rs.addColumn ("IS_GENERATED_COLUMN");
             
        return rs;
        }
	
	/**
	 * Return list of schemas in database. This driver only supports one schema
	 * per database, named "Excel".
	 * @return List of schemas
	 */
	
	@Override
	public ResultSet getSchemas () {
		
		rows.clear();
		rowIndex = 0;	
		
		String server = connection.getServer();
		String database = connection.getDatabase();
		String fileName = server + database;

		List<Object> row = new ArrayList<>();
		row.add (database);
		row.add ("Excel");
		rows.add (row);
		
		rs = new ResultSet (this);
		rs.addColumn ("TABLE_CATALOG");
		rs.addColumn ("TABLE_SCHEM");
		
		return rs;
		}
        
	/**
	 * Return a list of tables in the database. This driver maps each workbook
	 * page to a table.
	 * @param catalog
	 * @param schemaPattern
	 * @param tableNamePattern
	 * @param types
	 * @return 
	 */
     
	@Override
    public ResultSet getTables (String catalog, String schemaPattern, String tableNamePattern, String[] types) {
         
		rows.clear();
		rowIndex = 0;		
		String databaseName = connection.getDatabase();
		String schemaName = "Excel";
		
		String sx = null;
		if (tableNamePattern != null) sx = Util.sqlLikeToRegex(schemaPattern);
		String rx = null;
		if (tableNamePattern != null) rx = Util.sqlLikeToRegex(tableNamePattern);
		
		try {
			ExcelReader excel = this.connection.excel;
			List<String> sheetNames = excel.getSheetNames();
			for (String sheetName: sheetNames) {
				
				Boolean match = true;
				if (sx != null && !schemaName.matches(sx)) match = false;
				if (rx != null && !sheetName.matches(rx)) match = false;
				
				if (match == true) {
					List<Object> row = new ArrayList<>();
					row.add (databaseName);
					row.add (schemaName);
					row.add (sheetName);
					row.add ("TABLE");
					row.add (null);
					row.add (null);
					row.add (null);
					row.add (null);
					row.add (null);
					row.add (null);
					rows.add (row);
					}
				}
			}
		catch (Exception ex) {
			System.err.println (ex.getMessage());
			return null;
			}
		
        rs = new ResultSet(this);
        rs.addColumn ("TABLE_CAT");
        rs.addColumn ("TABLE_SCHEM");
        rs.addColumn ("TABLE_NAME");
        rs.addColumn ("TABLE_TYPE");
        rs.addColumn ("REMARKS");
        rs.addColumn ("TYPE_CAT");
        rs.addColumn ("TYPE_SCHEM");
        rs.addColumn ("TYPE_NAME");
        rs.addColumn ("SELF_REFERENCING_COL_NAME");
        rs.addColumn ("REF_GENERATION");
         
        return rs;
        }
	
	}
