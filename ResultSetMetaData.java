package JDBCExcel;

public class ResultSetMetaData extends BaseResultSetMetaData {
	
	ResultSet resultSet;
	
	public ResultSetMetaData (ResultSet rs) {		
		this.resultSet = rs;
		}
	
	@Override
	public int getColumnCount () {
		return resultSet.columns.size();
		}
	
	@Override
	public String getColumnLabel (int col) {
		return resultSet.columns.get(col-1);
		}
	
	@Override
	public String getColumnName (int col) {
		String name = resultSet.stmt.queryCols.get(col-1);
		if (name.startsWith("'") || name.startsWith("\"") || name.startsWith("[")) name = name.substring(1,name.length()-1);
		return name;
		}
	
	@Override
	public int getColumnType (int col) {
		return java.sql.Types.VARCHAR;
		}
	
	@Override
	public String getColumnTypeName (int col) {
		return "Text";
		}
	
	@Override
	public int getPrecision (int col) {
		return 256;
		}
	
	@Override
	public int getScale (int col) {
		return 0;
		}
	
	@Override
	public int isNullable (int col) {
		return java.sql.ResultSetMetaData.columnNullable;
		}
	
	}