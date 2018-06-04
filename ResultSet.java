package JDBCExcel;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ResultSet extends BaseResultSet {

	public List<String> columns = new ArrayList<>();
	public List<String> labels = new ArrayList<>();
	public List<String> types = new ArrayList<>();
	public List<Object> values = new ArrayList<>();

	DatabaseMetaData dbmd;
	ResultSetMetaData rsmd;
	PreparedStatement stmt;
	
	//--------------------------------------------------------------------------
	//	CONSTRUCTORS				A result set may be generated from metadata,
	//								or from a Statement.
	//--------------------------------------------------------------------------
	
	public ResultSet (DatabaseMetaData dbmd) {
		this.dbmd = dbmd;
		this.stmt = null;
		}
	
	public ResultSet (PreparedStatement stmt) {
		this.stmt = stmt;
		this.dbmd = null;
		}
	
	//--------------------------------------------------------------------------
	//	addColumn()					Add a column label to the result set.
	//--------------------------------------------------------------------------
	
	public void addColumn (String colName) {
		this.addColumn (colName,colName,"varchar(255)");
		}
	
	public void addColumn (String name, String label) {
		this.addColumn (name,label,"varchar(255)");
		}
	
	public void addColumn (String name, String label, String type) {
		columns.add (name);
		labels.add (label);
		types.add (type);
		}
	
	//--------------------------------------------------------------------------
	//	close()						Close result set, releasing resources.
	//--------------------------------------------------------------------------
	
	@Override
	public void close() {
		values = null;
		}
	
	@Override
	public int findColumn(String name) throws SQLException {
		return columns.indexOf(name) + 1;
		}
	
	public ResultSetMetaData getMetaData () {
		rsmd = new ResultSetMetaData (this);
		return rsmd;
		}
	
	public int getColumnCount() {
		return this.columns.size();
		}
	
	//--------------------------------------------------------------------------
	//	getInt()						Return column value as Integer
	//--------------------------------------------------------------------------
	
	@Override
	public int getInt (int col) throws SQLException {
		String s = values.get(col-1).toString();
		return Integer.parseInt(s);
		}
	
	@Override
	public int getInt (String name) throws SQLException {
		return getInt (findColumn (name));
		}
	
	//--------------------------------------------------------------------------
	//	getObject()					Return column value as Object
	//--------------------------------------------------------------------------
		
	@Override
	public Object getObject(int col) {
		Object o = values.get(col-1);
		return o;
		}
	
	@Override
	public Object getObject (String name) throws SQLException {
		return getObject (findColumn (name));
		}
	
	//--------------------------------------------------------------------------
	//	getString()					Return column value as String
	//--------------------------------------------------------------------------
	
	@Override
	public String getString(int col) {
		String s = null;
		Object o = values.get(col-1);
		if (o != null) s = o.toString();
		return s;
		}
	
	@Override
	public String getString(String name) throws SQLException {
		return getString (findColumn (name));
		}
	
	//--------------------------------------------------------------------------
	//	getType()					Return java type.
	//--------------------------------------------------------------------------
	
	@Override
	public int getType() {
		return ResultSet.TYPE_FORWARD_ONLY;
		}
	
	@Override
	public boolean isClosed() {
		return false;
		}
	
	//--------------------------------------------------------------------------
	//	next()						Populate the result set with the values
	//								for the next row.
	//--------------------------------------------------------------------------
	
	@Override
	public boolean next() throws SQLException {
		if (this.dbmd != null) values = dbmd.next();
		else if (this.stmt != null) values = stmt.next();
		return values != null;
		}
	
	//--------------------------------------------------------------------------
	//	print()						Helper function to dump result set
	//--------------------------------------------------------------------------
	
	public void print () {
		for (Object value: values) {
			System.err.print (value.toString() + "; ");
			}
		System.err.println();
		}
	
	@Override
	public void setFetchSize (int i) {
		}
	
	}