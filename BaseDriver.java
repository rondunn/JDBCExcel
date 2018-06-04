package JDBCExcel;

//------------------------------------------------------------------------------
//	Class:						BaseDriver
//	Description:				Base implementation of all methods and fields
//								from DRIVER interface.
//------------------------------------------------------------------------------

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

public class BaseDriver implements java.sql.Driver {

	final String msgMNI = "Driver method not implemented";

	@Override
	public boolean acceptsURL(String s) throws SQLException {
		throw new SQLException (msgMNI);
		}


	@Override
    public Connection connect(String url, Properties properties) throws SQLException {
 		throw new SQLException (msgMNI);
		}

	@Override
	public int getMajorVersion() {
 		return 0;
		}

	@Override
    public int getMinorVersion() {
 		return 0;
		}

	@Override
    public Logger getParentLogger() {
 		return null;
		}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String s, Properties props) throws SQLException {
		throw new SQLException(msgMNI);
		}	
    
	@Override
	public boolean jdbcCompliant() {
 		return false;
		}

	}
