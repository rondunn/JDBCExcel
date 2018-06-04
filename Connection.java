package JDBCExcel;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Connection extends BaseConnection {
	
	protected Driver driver;
	protected ExcelReader excel;
	protected Map<String,String> properties;
	
	public Connection (Driver driver, String url, Properties properties) throws SQLException {
		
		this.driver = driver;
		
		// Parse connection properties from the URL.
		if (url != null) this.properties = parseUrl (url);

		// Add (overwrite) the formal driver properties.
		if (properties != null) {
			for (Map.Entry<?, ?> entry: properties.entrySet()) {
				String key = (String) entry.getKey();
				String value = (String) entry.getValue();
				this.properties.put (key,value);
				}
			}
		
		String server = this.properties.get("SERVER");
		String database = this.properties.get("DATABASE");
		String fileName = server + database;
		try {
			excel = new ExcelReader ();
			excel.openWorkbook (fileName);
			}
		catch (Exception ex) {
			throw new SQLException ("Connection: Error opening " + fileName);
			}

		}	
	
	@Override
	public void close() throws SQLException {
		try {
			properties = null;
			excel.closeWorkbook();
			}
		catch (Exception e) {
			throw new SQLException (e.getMessage());
			}
		}
	
	@Override
	public Statement createStatement() throws SQLException {
		Statement statement = new Statement (this);
		return statement;
		}
	
	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		return createStatement();
		}
	
	@Override
	public DatabaseMetaData getMetaData () {
		return new DatabaseMetaData (this);
		}
	
	@Override
	public PreparedStatement prepareStatement (String sql) {
		PreparedStatement pstmt = new PreparedStatement (this,sql);
		return pstmt;
		}
	
	@Override
	public PreparedStatement prepareStatement (String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return prepareStatement (sql);
		}
	
	public String getDatabase() {
		return this.properties.get("DATABASE");
		}
	
	public String getPort() {
		return this.properties.get("PORT");
		}
	
	public String getServer() {
		return this.properties.get("SERVER");
		}

	public Map<String,String> parseUrl (String urlString) {
		
		if (urlString == null) return null;
		Map<String,String> props = new HashMap<>();
		
		int i = urlString.indexOf("://");
		String query = urlString.substring(i+3);
		
		if (query == null) return null;

		String avps[] = query.split (";");
		for (String av: avps) {
			String a[] = av.split("=");
			props.put (a[0].toUpperCase(),a[1]);
			}

		return props;
		}
	
	}