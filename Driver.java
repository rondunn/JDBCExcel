package JDBCExcel;

import java.sql.*;
import java.util.Properties;

public class Driver extends BaseDriver {
	
    static {
        try {
            DriverManager.registerDriver(new Driver());
			}
        catch (SQLException e) {
            e.printStackTrace();
        	}
    	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		if (url == null) throw new SQLException ("acceptsURL: Null URL");
        return url.startsWith("jdbc:JDBCExcel");
    	}
	
	@Override
    public Connection connect(String url, Properties properties) throws SQLException {
		if (!acceptsURL(url)) return null;
        return new Connection(this, url, properties);
    	}

	}
