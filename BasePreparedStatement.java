
package JDBCExcel;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

public class BasePreparedStatement implements java.sql.PreparedStatement {

	@Override
	public ResultSet executeQuery() throws SQLException {
		throw new SQLException("Method executeQuery not implemented.");
	}

	@Override
	public int executeUpdate() throws SQLException {
		throw new SQLException("Method executeUpdate not implemented.");
	}

	@Override
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		throw new SQLException("Method setNull not implemented.");
	}

	@Override
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		throw new SQLException("Method setBoolean not implemented.");
	}

	@Override
	public void setByte(int parameterIndex, byte x) throws SQLException {
		throw new SQLException("Method setByte not implemented.");
	}

	@Override
	public void setShort(int parameterIndex, short x) throws SQLException {
		throw new SQLException("Method setShort not implemented.");
	}

	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
		throw new SQLException("Method setInt not implemented.");
	}

	@Override
	public void setLong(int parameterIndex, long x) throws SQLException {
		throw new SQLException("Method setLong not implemented.");
	}

	@Override
	public void setFloat(int parameterIndex, float x) throws SQLException {
		throw new SQLException("Method setFloat not implemented.");
	}

	@Override
	public void setDouble(int parameterIndex, double x) throws SQLException {
		throw new SQLException("Method setDouble not implemented.");
	}

	@Override
	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		throw new SQLException("Method setBigDecimal not implemented.");
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
		throw new SQLException("Method setString not implemented.");
	}

	@Override
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		throw new SQLException("Method setBytes not implemented.");
	}

	@Override
	public void setDate(int parameterIndex, Date x) throws SQLException {
		throw new SQLException("Method setDate not implemented.");
	}

	@Override
	public void setTime(int parameterIndex, Time x) throws SQLException {
		throw new SQLException("Method setTime not implemented.");
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		throw new SQLException("Method setTimestamp not implemented.");
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		throw new SQLException("Method setAsciiStream not implemented.");
	}

	@Override
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		throw new SQLException("Method setUnicodeStream not implemented.");
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		throw new SQLException("Method setBinaryStream not implemented.");
	}

	@Override
	public void clearParameters() throws SQLException {
		throw new SQLException("Method clearParameters not implemented.");
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		throw new SQLException("Method setObject not implemented.");
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
		throw new SQLException("Method setObject not implemented.");
	}

	@Override
	public boolean execute() throws SQLException {
		throw new SQLException("Method execute not implemented.");
	}

	@Override
	public void addBatch() throws SQLException {
		throw new SQLException("Method addBatch not implemented.");
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		throw new SQLException("Method setCharacterStream not implemented.");
	}

	@Override
	public void setRef(int parameterIndex, Ref x) throws SQLException {
		throw new SQLException("Method setRef not implemented.");
	}

	@Override
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		throw new SQLException("Method setBlob not implemented.");
	}

	@Override
	public void setClob(int parameterIndex, Clob x) throws SQLException {
		throw new SQLException("Method setClob not implemented.");
	}

	@Override
	public void setArray(int parameterIndex, Array x) throws SQLException {
		throw new SQLException("Method setArray not implemented.");
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		throw new SQLException("Method getMetaData not implemented.");
	}

	@Override
	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		throw new SQLException("Method setDate not implemented.");
	}

	@Override
	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		throw new SQLException("Method setTime not implemented.");
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		throw new SQLException("Method setTimestamp not implemented.");
	}

	@Override
	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		throw new SQLException("Method setNull not implemented.");
	}

	@Override
	public void setURL(int parameterIndex, URL x) throws SQLException {
		throw new SQLException("Method setURL not implemented.");
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		throw new SQLException("Method getParameterMetaData not implemented.");
	}

	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		throw new SQLException("Method setRowId not implemented.");
	}

	@Override
	public void setNString(int parameterIndex, String value) throws SQLException {
		throw new SQLException("Method setNString not implemented.");
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		throw new SQLException("Method setNCharacterStream not implemented.");
	}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		throw new SQLException("Method setNClob not implemented.");
	}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		throw new SQLException("Method setClob not implemented.");
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		throw new SQLException("Method setBlob not implemented.");
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		throw new SQLException("Method setNClob not implemented.");
	}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		throw new SQLException("Method setSQLXML not implemented.");
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		throw new SQLException("Method setObject not implemented.");
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		throw new SQLException("Method setAsciiStream not implemented.");
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		throw new SQLException("Method setBinaryStream not implemented.");
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		throw new SQLException("Method setCharacterStream not implemented.");
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		throw new SQLException("Method setAsciiStream not implemented.");
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		throw new SQLException("Method setBinaryStream not implemented.");
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		throw new SQLException("Method setCharacterStream not implemented.");
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		throw new SQLException("Method setNCharacterStream not implemented.");
	}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		throw new SQLException("Method setClob not implemented.");
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		throw new SQLException("Method setBlob not implemented.");
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		throw new SQLException("Method setNClob not implemented.");
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		throw new SQLException("Method executeQuery not implemented.");
	}

	@Override
	public int executeUpdate(String sql) throws SQLException {
		throw new SQLException("Method executeUpdate not implemented.");
	}

	@Override
	public void close() throws SQLException {
		throw new SQLException("Method close not implemented.");
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		throw new SQLException("Method getMaxFieldSize not implemented.");
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
		throw new SQLException("Method setMaxFieldSize not implemented.");
	}

	@Override
	public int getMaxRows() throws SQLException {
		throw new SQLException("Method getMaxRows not implemented.");
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		throw new SQLException("Method setMaxRows not implemented.");
	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		throw new SQLException("Method setEscapeProcessing not implemented.");
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		throw new SQLException("Method getQueryTimeout not implemented.");
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		throw new SQLException("Method setQueryTimeout not implemented.");
	}

	@Override
	public void cancel() throws SQLException {
		throw new SQLException("Method cancel not implemented.");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		throw new SQLException("Method getWarnings not implemented.");
	}

	@Override
	public void clearWarnings() throws SQLException {
		throw new SQLException("Method clearWarnings not implemented.");
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		throw new SQLException("Method setCursorName not implemented.");
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		throw new SQLException("Method execute not implemented.");
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		throw new SQLException("Method getResultSet not implemented.");
	}

	@Override
	public int getUpdateCount() throws SQLException {
		throw new SQLException("Method getUpdateCount not implemented.");
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		throw new SQLException("Method getMoreResults not implemented.");
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		throw new SQLException("Method setFetchDirection not implemented.");
	}

	@Override
	public int getFetchDirection() throws SQLException {
		throw new SQLException("Method getFetchDirection not implemented.");
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		throw new SQLException("Method setFetchSize not implemented.");
	}

	@Override
	public int getFetchSize() throws SQLException {
		throw new SQLException("Method getFetchSize not implemented.");
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		throw new SQLException("Method getResultSetConcurrency not implemented.");
	}

	@Override
	public int getResultSetType() throws SQLException {
		throw new SQLException("Method getResultSetType not implemented.");
	}

	@Override
	public void addBatch(String sql) throws SQLException {
		throw new SQLException("Method addBatch not implemented.");
	}

	@Override
	public void clearBatch() throws SQLException {
		throw new SQLException("Method clearBatch not implemented.");
	}

	@Override
	public int[] executeBatch() throws SQLException {
		throw new SQLException("Method executeBatch not implemented.");
	}

	@Override
	public Connection getConnection() throws SQLException {
		throw new SQLException("Method getConnection not implemented.");
	}

	@Override
	public boolean getMoreResults(int current) throws SQLException {
		throw new SQLException("Method getMoreResults not implemented.");
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		throw new SQLException("Method getGeneratedKeys not implemented.");
	}

	@Override
	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		throw new SQLException("Method executeUpdate not implemented.");
	}

	@Override
	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		throw new SQLException("Method executeUpdate not implemented.");
	}

	@Override
	public int executeUpdate(String sql, String[] columnNames) throws SQLException {
		throw new SQLException("Method executeUpdate not implemented.");
	}

	@Override
	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
		throw new SQLException("Method execute not implemented.");
	}

	@Override
	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		throw new SQLException("Method execute not implemented.");
	}

	@Override
	public boolean execute(String sql, String[] columnNames) throws SQLException {
		throw new SQLException("Method execute not implemented.");
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		throw new SQLException("Method getResultSetHoldability not implemented.");
	}

	@Override
	public boolean isClosed() throws SQLException {
		throw new SQLException("Method isClosed not implemented.");
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		throw new SQLException("Method setPoolable not implemented.");
	}

	@Override
	public boolean isPoolable() throws SQLException {
		throw new SQLException("Method isPoolable not implemented.");
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		throw new SQLException("Method closeOnCompletion not implemented.");
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		throw new SQLException("Method isCloseOnCompletion not implemented.");
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new SQLException("Method unwrap not implemented.");
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw new SQLException("Method isWrapperFor not implemented.");
	}
	
}
