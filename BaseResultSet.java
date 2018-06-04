/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCExcel;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
 *
 * @author ron
 */
public class BaseResultSet implements java.sql.ResultSet {

	@Override
	public boolean next() throws SQLException {
		throw new SQLException("Method next not implemented.");
	}

	@Override
	public void close() throws SQLException {
		throw new SQLException("Method close not implemented.");
	}

	@Override
	public boolean wasNull() throws SQLException {
		throw new SQLException("Method wasNull not implemented.");
	}

	@Override
	public String getString(int columnIndex) throws SQLException {
		throw new SQLException("Method getString not implemented.");
	}

	@Override
	public boolean getBoolean(int columnIndex) throws SQLException {
		throw new SQLException("Method getBoolean not implemented.");
	}

	@Override
	public byte getByte(int columnIndex) throws SQLException {
		throw new SQLException("Method getByte not implemented.");
	}

	@Override
	public short getShort(int columnIndex) throws SQLException {
		throw new SQLException("Method getShort not implemented.");
	}

	@Override
	public int getInt(int columnIndex) throws SQLException {
		throw new SQLException("Method getInt not implemented.");
	}

	@Override
	public long getLong(int columnIndex) throws SQLException {
		throw new SQLException("Method getLong not implemented.");
	}

	@Override
	public float getFloat(int columnIndex) throws SQLException {
		throw new SQLException("Method getFloat not implemented.");
	}

	@Override
	public double getDouble(int columnIndex) throws SQLException {
		throw new SQLException("Method getDouble not implemented.");
	}

	@Override
	public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
		throw new SQLException("Method getBigDecimal not implemented.");
	}

	@Override
	public byte[] getBytes(int columnIndex) throws SQLException {
		throw new SQLException("Method getBytes not implemented.");
	}

	@Override
	public Date getDate(int columnIndex) throws SQLException {
		throw new SQLException("Method getDate not implemented.");
	}

	@Override
	public Time getTime(int columnIndex) throws SQLException {
		throw new SQLException("Method getTime not implemented.");
	}

	@Override
	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		throw new SQLException("Method getTimestamp not implemented.");
	}

	@Override
	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		throw new SQLException("Method getAsciiStream not implemented.");
	}

	@Override
	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		throw new SQLException("Method getUnicodeStream not implemented.");
	}

	@Override
	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		throw new SQLException("Method getBinaryStream not implemented.");
	}

	@Override
	public String getString(String columnLabel) throws SQLException {
		throw new SQLException("Method getString not implemented.");
	}

	@Override
	public boolean getBoolean(String columnLabel) throws SQLException {
		throw new SQLException("Method getBoolean not implemented.");
	}

	@Override
	public byte getByte(String columnLabel) throws SQLException {
		throw new SQLException("Method getByte not implemented.");
	}

	@Override
	public short getShort(String columnLabel) throws SQLException {
		throw new SQLException("Method getShort not implemented.");
	}

	@Override
	public int getInt(String columnLabel) throws SQLException {
		throw new SQLException("Method getInt not implemented.");
	}

	@Override
	public long getLong(String columnLabel) throws SQLException {
		throw new SQLException("Method getLong not implemented.");
	}

	@Override
	public float getFloat(String columnLabel) throws SQLException {
		throw new SQLException("Method getFloat not implemented.");
	}

	@Override
	public double getDouble(String columnLabel) throws SQLException {
		throw new SQLException("Method getDouble not implemented.");
	}

	@Override
	public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
		throw new SQLException("Method getBigDecimal not implemented.");
	}

	@Override
	public byte[] getBytes(String columnLabel) throws SQLException {
		throw new SQLException("Method getBytes not implemented.");
	}

	@Override
	public Date getDate(String columnLabel) throws SQLException {
		throw new SQLException("Method getDate not implemented.");
	}

	@Override
	public Time getTime(String columnLabel) throws SQLException {
		throw new SQLException("Method getTime not implemented.");
	}

	@Override
	public Timestamp getTimestamp(String columnLabel) throws SQLException {
		throw new SQLException("Method getTimestamp not implemented.");
	}

	@Override
	public InputStream getAsciiStream(String columnLabel) throws SQLException {
		throw new SQLException("Method getAsciiStream not implemented.");
	}

	@Override
	public InputStream getUnicodeStream(String columnLabel) throws SQLException {
		throw new SQLException("Method getUnicodeStream not implemented.");
	}

	@Override
	public InputStream getBinaryStream(String columnLabel) throws SQLException {
		throw new SQLException("Method getBinaryStream not implemented.");
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
	public String getCursorName() throws SQLException {
		throw new SQLException("Method getCursorName not implemented.");
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		throw new SQLException("Method getMetaData not implemented.");
	}

	@Override
	public Object getObject(int columnIndex) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
	}

	@Override
	public Object getObject(String columnLabel) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
	}

	@Override
	public int findColumn(String columnLabel) throws SQLException {
		throw new SQLException("Method findColumn not implemented.");
	}

	@Override
	public Reader getCharacterStream(int columnIndex) throws SQLException {
		throw new SQLException("Method getCharacterStream not implemented.");
	}

	@Override
	public Reader getCharacterStream(String columnLabel) throws SQLException {
		throw new SQLException("Method getCharacterStream not implemented.");
	}

	@Override
	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		throw new SQLException("Method getBigDecimal not implemented.");
	}

	@Override
	public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
		throw new SQLException("Method getBigDecimal not implemented.");
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		throw new SQLException("Method isBeforeFirst not implemented.");
	}

	@Override
	public boolean isAfterLast() throws SQLException {
		throw new SQLException("Method isAfterLast not implemented.");
	}

	@Override
	public boolean isFirst() throws SQLException {
		throw new SQLException("Method isFirst not implemented.");
	}

	@Override
	public boolean isLast() throws SQLException {
		throw new SQLException("Method isLast not implemented.");
	}

	@Override
	public void beforeFirst() throws SQLException {
		throw new SQLException("Method beforeFirst not implemented.");
	}

	@Override
	public void afterLast() throws SQLException {
		throw new SQLException("Method afterLast not implemented.");
	}

	@Override
	public boolean first() throws SQLException {
		throw new SQLException("Method first not implemented.");
	}

	@Override
	public boolean last() throws SQLException {
		throw new SQLException("Method last not implemented.");
	}

	@Override
	public int getRow() throws SQLException {
		throw new SQLException("Method getRow not implemented.");
	}

	@Override
	public boolean absolute(int row) throws SQLException {
		throw new SQLException("Method absolute not implemented.");
	}

	@Override
	public boolean relative(int rows) throws SQLException {
		throw new SQLException("Method relative not implemented.");
	}

	@Override
	public boolean previous() throws SQLException {
		throw new SQLException("Method previous not implemented.");
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
	public int getType() throws SQLException {
		throw new SQLException("Method getType not implemented.");
	}

	@Override
	public int getConcurrency() throws SQLException {
		throw new SQLException("Method getConcurrency not implemented.");
	}

	@Override
	public boolean rowUpdated() throws SQLException {
		throw new SQLException("Method rowUpdated not implemented.");
	}

	@Override
	public boolean rowInserted() throws SQLException {
		throw new SQLException("Method rowInserted not implemented.");
	}

	@Override
	public boolean rowDeleted() throws SQLException {
		throw new SQLException("Method rowDeleted not implemented.");
	}

	@Override
	public void updateNull(int columnIndex) throws SQLException {
		throw new SQLException("Method updateNull not implemented.");
	}

	@Override
	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		throw new SQLException("Method updateBoolean not implemented.");
	}

	@Override
	public void updateByte(int columnIndex, byte x) throws SQLException {
		throw new SQLException("Method updateByte not implemented.");
	}

	@Override
	public void updateShort(int columnIndex, short x) throws SQLException {
		throw new SQLException("Method updateShort not implemented.");
	}

	@Override
	public void updateInt(int columnIndex, int x) throws SQLException {
		throw new SQLException("Method updateInt not implemented.");
	}

	@Override
	public void updateLong(int columnIndex, long x) throws SQLException {
		throw new SQLException("Method updateLong not implemented.");
	}

	@Override
	public void updateFloat(int columnIndex, float x) throws SQLException {
		throw new SQLException("Method updateFloat not implemented.");
	}

	@Override
	public void updateDouble(int columnIndex, double x) throws SQLException {
		throw new SQLException("Method updateDouble not implemented.");
	}

	@Override
	public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
		throw new SQLException("Method updateBigDecimal not implemented.");
	}

	@Override
	public void updateString(int columnIndex, String x) throws SQLException {
		throw new SQLException("Method updateString not implemented.");
	}

	@Override
	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		throw new SQLException("Method updateBytes not implemented.");
	}

	@Override
	public void updateDate(int columnIndex, Date x) throws SQLException {
		throw new SQLException("Method updateDate not implemented.");
	}

	@Override
	public void updateTime(int columnIndex, Time x) throws SQLException {
		throw new SQLException("Method updateTime not implemented.");
	}

	@Override
	public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
		throw new SQLException("Method updateTimestamp not implemented.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
		throw new SQLException("Method updateObject not implemented.");
	}

	@Override
	public void updateObject(int columnIndex, Object x) throws SQLException {
		throw new SQLException("Method updateObject not implemented.");
	}

	@Override
	public void updateNull(String columnLabel) throws SQLException {
		throw new SQLException("Method updateNull not implemented.");
	}

	@Override
	public void updateBoolean(String columnLabel, boolean x) throws SQLException {
		throw new SQLException("Method updateBoolean not implemented.");
	}

	@Override
	public void updateByte(String columnLabel, byte x) throws SQLException {
		throw new SQLException("Method updateByte not implemented.");
	}

	@Override
	public void updateShort(String columnLabel, short x) throws SQLException {
		throw new SQLException("Method updateShort not implemented.");
	}

	@Override
	public void updateInt(String columnLabel, int x) throws SQLException {
		throw new SQLException("Method updateInt not implemented.");
	}

	@Override
	public void updateLong(String columnLabel, long x) throws SQLException {
		throw new SQLException("Method updateLong not implemented.");
	}

	@Override
	public void updateFloat(String columnLabel, float x) throws SQLException {
		throw new SQLException("Method updateFloat not implemented.");
	}

	@Override
	public void updateDouble(String columnLabel, double x) throws SQLException {
		throw new SQLException("Method updateDouble not implemented.");
	}

	@Override
	public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
		throw new SQLException("Method updateBigDecimal not implemented.");
	}

	@Override
	public void updateString(String columnLabel, String x) throws SQLException {
		throw new SQLException("Method updateString not implemented.");
	}

	@Override
	public void updateBytes(String columnLabel, byte[] x) throws SQLException {
		throw new SQLException("Method updateBytes not implemented.");
	}

	@Override
	public void updateDate(String columnLabel, Date x) throws SQLException {
		throw new SQLException("Method updateDate not implemented.");
	}

	@Override
	public void updateTime(String columnLabel, Time x) throws SQLException {
		throw new SQLException("Method updateTime not implemented.");
	}

	@Override
	public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
		throw new SQLException("Method updateTimestamp not implemented.");
	}

	@Override
	public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
		throw new SQLException("Method updateObject not implemented.");
	}

	@Override
	public void updateObject(String columnLabel, Object x) throws SQLException {
		throw new SQLException("Method updateObject not implemented.");
	}

	@Override
	public void insertRow() throws SQLException {
		throw new SQLException("Method insertRow not implemented.");
	}

	@Override
	public void updateRow() throws SQLException {
		throw new SQLException("Method updateRow not implemented.");
	}

	@Override
	public void deleteRow() throws SQLException {
		throw new SQLException("Method deleteRow not implemented.");
	}

	@Override
	public void refreshRow() throws SQLException {
		throw new SQLException("Method refreshRow not implemented.");
	}

	@Override
	public void cancelRowUpdates() throws SQLException {
		throw new SQLException("Method cancelRowUpdates not implemented.");
	}

	@Override
	public void moveToInsertRow() throws SQLException {
		throw new SQLException("Method moveToInsertRow not implemented.");
	}

	@Override
	public void moveToCurrentRow() throws SQLException {
		throw new SQLException("Method moveToCurrentRow not implemented.");
	}

	@Override
	public Statement getStatement() throws SQLException {
		throw new SQLException("Method getStatement not implemented.");
	}

	@Override
	public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
	}

	@Override
	public Ref getRef(int columnIndex) throws SQLException {
		throw new SQLException("Method getRef not implemented.");
	}

	@Override
	public Blob getBlob(int columnIndex) throws SQLException {
		throw new SQLException("Method getBlob not implemented.");
	}

	@Override
	public Clob getClob(int columnIndex) throws SQLException {
		throw new SQLException("Method getClob not implemented.");
	}

	@Override
	public Array getArray(int columnIndex) throws SQLException {
		throw new SQLException("Method getArray not implemented.");
	}

	@Override
	public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
	}

	@Override
	public Ref getRef(String columnLabel) throws SQLException {
		throw new SQLException("Method getRef not implemented.");
	}

	@Override
	public Blob getBlob(String columnLabel) throws SQLException {
		throw new SQLException("Method getBlob not implemented.");
	}

	@Override
	public Clob getClob(String columnLabel) throws SQLException {
		throw new SQLException("Method getClob not implemented.");
	}

	@Override
	public Array getArray(String columnLabel) throws SQLException {
		throw new SQLException("Method getArray not implemented.");
	}

	@Override
	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		throw new SQLException("Method getDate not implemented.");
	}

	@Override
	public Date getDate(String columnLabel, Calendar cal) throws SQLException {
		throw new SQLException("Method getDate not implemented.");
	}

	@Override
	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		throw new SQLException("Method getTime not implemented.");
	}

	@Override
	public Time getTime(String columnLabel, Calendar cal) throws SQLException {
		throw new SQLException("Method getTime not implemented.");
	}

	@Override
	public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
		throw new SQLException("Method getTimestamp not implemented.");
	}

	@Override
	public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
		throw new SQLException("Method getTimestamp not implemented.");
	}

	@Override
	public URL getURL(int columnIndex) throws SQLException {
		throw new SQLException("Method getURL not implemented.");
	}

	@Override
	public URL getURL(String columnLabel) throws SQLException {
		throw new SQLException("Method getURL not implemented.");
	}

	@Override
	public void updateRef(int columnIndex, Ref x) throws SQLException {
		throw new SQLException("Method updateRef not implemented.");
	}

	@Override
	public void updateRef(String columnLabel, Ref x) throws SQLException {
		throw new SQLException("Method updateRef not implemented.");
	}

	@Override
	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateBlob(String columnLabel, Blob x) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateClob(int columnIndex, Clob x) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateClob(String columnLabel, Clob x) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateArray(int columnIndex, Array x) throws SQLException {
		throw new SQLException("Method updateArray not implemented.");
	}

	@Override
	public void updateArray(String columnLabel, Array x) throws SQLException {
		throw new SQLException("Method updateArray not implemented.");
	}

	@Override
	public RowId getRowId(int columnIndex) throws SQLException {
		throw new SQLException("Method getRowId not implemented.");
	}

	@Override
	public RowId getRowId(String columnLabel) throws SQLException {
		throw new SQLException("Method getRowId not implemented.");
	}

	@Override
	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		throw new SQLException("Method updateRowId not implemented.");
	}

	@Override
	public void updateRowId(String columnLabel, RowId x) throws SQLException {
		throw new SQLException("Method updateRowId not implemented.");
	}

	@Override
	public int getHoldability() throws SQLException {
		throw new SQLException("Method getHoldability not implemented.");
	}

	@Override
	public boolean isClosed() throws SQLException {
		throw new SQLException("Method isClosed not implemented.");
	}

	@Override
	public void updateNString(int columnIndex, String nString) throws SQLException {
		throw new SQLException("Method updateNString not implemented.");
	}

	@Override
	public void updateNString(String columnLabel, String nString) throws SQLException {
		throw new SQLException("Method updateNString not implemented.");
	}

	@Override
	public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public NClob getNClob(int columnIndex) throws SQLException {
		throw new SQLException("Method getNClob not implemented.");
	}

	@Override
	public NClob getNClob(String columnLabel) throws SQLException {
		throw new SQLException("Method getNClob not implemented.");
	}

	@Override
	public SQLXML getSQLXML(int columnIndex) throws SQLException {
		throw new SQLException("Method getSQLXML not implemented.");
	}

	@Override
	public SQLXML getSQLXML(String columnLabel) throws SQLException {
		throw new SQLException("Method getSQLXML not implemented.");
	}

	@Override
	public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
		throw new SQLException("Method updateSQLXML not implemented.");
	}

	@Override
	public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
		throw new SQLException("Method updateSQLXML not implemented.");
	}

	@Override
	public String getNString(int columnIndex) throws SQLException {
		throw new SQLException("Method getNString not implemented.");
	}

	@Override
	public String getNString(String columnLabel) throws SQLException {
		throw new SQLException("Method getNString not implemented.");
	}

	@Override
	public Reader getNCharacterStream(int columnIndex) throws SQLException {
		throw new SQLException("Method getNCharacterStream not implemented.");
	}

	@Override
	public Reader getNCharacterStream(String columnLabel) throws SQLException {
		throw new SQLException("Method getNCharacterStream not implemented.");
	}

	@Override
	public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
		throw new SQLException("Method updateNCharacterStream not implemented.");
	}

	@Override
	public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateNCharacterStream not implemented.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
		throw new SQLException("Method updateNCharacterStream not implemented.");
	}

	@Override
	public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
		throw new SQLException("Method updateNCharacterStream not implemented.");
	}

	@Override
	public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
		throw new SQLException("Method updateAsciiStream not implemented.");
	}

	@Override
	public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
		throw new SQLException("Method updateBinaryStream not implemented.");
	}

	@Override
	public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
		throw new SQLException("Method updateCharacterStream not implemented.");
	}

	@Override
	public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
		throw new SQLException("Method updateBlob not implemented.");
	}

	@Override
	public void updateClob(int columnIndex, Reader reader) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateClob(String columnLabel, Reader reader) throws SQLException {
		throw new SQLException("Method updateClob not implemented.");
	}

	@Override
	public void updateNClob(int columnIndex, Reader reader) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public void updateNClob(String columnLabel, Reader reader) throws SQLException {
		throw new SQLException("Method updateNClob not implemented.");
	}

	@Override
	public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
	}

	@Override
	public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
		throw new SQLException("Method getObject not implemented.");
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
