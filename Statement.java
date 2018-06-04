package JDBCExcel;

import java.sql.*;

public class Statement extends BaseStatement {
	
	Connection connection;
	DatabaseMetaData dbmd;
	PreparedStatement pstmt;
	
	public Statement (Connection con) {
		
		//System.err.println ("Statement");
		
		this.connection = con;
		dbmd = new DatabaseMetaData (con);
		}
	
	@Override
	public ResultSet executeQuery (String query) throws SQLException {
		
		this.pstmt = new PreparedStatement (this.connection,query);
		return pstmt.executeQuery();
		}

	
	@Override
	public void setFetchSize (int rows) throws SQLException {
		}
		
	}