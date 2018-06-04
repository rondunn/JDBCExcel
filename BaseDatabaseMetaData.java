package JDBCExcel;


import java.sql.*;

public class BaseDatabaseMetaData implements java.sql.DatabaseMetaData {
	
	final String msgMNI = "Connection method not implemented";
		
	@Override
	public boolean allProceduresAreCallable() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean allTablesAreSelectable() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean deletesAreDetected(int type) throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public boolean generatedKeyAlwaysReturned() throws SQLException {
		throw new SQLException(msgMNI);
		}
		
	@Override
	public ResultSet getAttributes (String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getBestRowIdentifier (String catalog, String schema, String table, int scope, boolean nullable) throws SQLException {
		throw new SQLException (msgMNI);
		}

	@Override
	public ResultSet getCatalogs () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getCatalogSeparator() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getCatalogTerm() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getClientInfoProperties() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}

	@Override
	public ResultSet getColumns (String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public Connection getConnection() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getDatabaseMajorVersion () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getDatabaseMinorVersion () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getDatabaseProductName () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getDatabaseProductVersion() throws SQLException {
		throw new SQLException (msgMNI);
		}
	
	@Override
	public int getDefaultTransactionIsolation() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getDriverMajorVersion() {
		return 0;
		}
		
	@Override
	public int getDriverMinorVersion() {
		return 0;
		}
		
	@Override
	public String getDriverName() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getDriverVersion() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getExtraNameCharacters() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
	
	@Override
	public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getIdentifierQuoteString() throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getIndexInfo (String catalog, String schema, String table, boolean unique, boolean approximate) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getJDBCMajorVersion () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getJDBCMinorVersion () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxBinaryLiteralLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxCatalogNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxCharLiteralLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnsInGroupBy () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnsInIndex () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnsInOrderBy () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnsInSelect () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxColumnsInTable () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxConnections () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxCursorNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxIndexLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxProcedureNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxRowSize () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxSchemaNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
	
	@Override
	public int getMaxStatementLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxStatements () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxTableNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxTablesInSelect () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getMaxUserNameLength () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getNumericFunctions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getPrimaryKeys (String catalog, String schema, String table) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getProcedureColumns (String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getProcedures (String catalog, String schemaPattern, String procedureNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getProcedureTerm () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getPseudoColumns (String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getResultSetHoldability () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public RowIdLifetime getRowIdLifetime () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getSchemas () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getSchemas (String catalog, String schemaPattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getSchemaTerm () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getSearchStringEscape () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getSQLKeywords () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public int getSQLStateType () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getStringFunctions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getSuperTables (String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getSuperTypes (String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getSystemFunctions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getTablePrivileges (String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getTables (String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getTableTypes () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getTimeDateFunctions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getTypeInfo () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getUDTs (String catalog, String schemaPattern, String typeNamePattern, int[] types) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getURL () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public String getUserName () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public ResultSet getVersionColumns (String catalog, String schema, String table) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean insertsAreDetected (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean isCatalogAtStart () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean isReadOnly () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean locatorsUpdateCopy () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean nullPlusNonNullIsNull () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean nullsAreSortedAtEnd () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean nullsAreSortedAtStart () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean nullsAreSortedHigh () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean nullsAreSortedLow () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean othersDeletesAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean othersInsertsAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean othersUpdatesAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean ownDeletesAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean ownInsertsAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean ownUpdatesAreVisible (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesLowerCaseIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesLowerCaseQuotedIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesMixedCaseIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesMixedCaseQuotedIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesUpperCaseIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean storesUpperCaseQuotedIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsAlterTableWithAddColumn () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsAlterTableWithDropColumn () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsANSI92EntryLevelSQL () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsANSI92FullSQL () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsANSI92IntermediateSQL () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsBatchUpdates () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCatalogsInDataManipulation () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCatalogsInIndexDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCatalogsInPrivilegeDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCatalogsInProcedureCalls () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCatalogsInTableDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsColumnAliasing () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsConvert () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsConvert (int fromType, int toType) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCoreSQLGrammar () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsCorrelatedSubqueries () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsDataDefinitionAndDataManipulationTransactions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsDataManipulationTransactionsOnly () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsDifferentTableCorrelationNames () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsExpressionsInOrderBy () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsExtendedSQLGrammar () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsFullOuterJoins () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsGetGeneratedKeys () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsGroupBy () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsGroupByBeyondSelect () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsGroupByUnrelated () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsIntegrityEnhancementFacility () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsLikeEscapeClause () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsLimitedOuterJoins () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMinimumSQLGrammar () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMixedCaseIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMixedCaseQuotedIdentifiers () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMultipleOpenResults () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMultipleResultSets () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsMultipleTransactions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsNamedParameters () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsNonNullableColumns () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOpenCursorsAcrossCommit () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOpenCursorsAcrossRollback () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOpenStatementsAcrossCommit () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOpenStatementsAcrossRollback () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOrderByUnrelated () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsOuterJoins () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsPositionedDelete () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsPositionedUpdate () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsResultSetConcurrency (int type, int concurrency) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsResultSetHoldability (int holdability) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsResultSetType (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSavepoints () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSchemasInDataManipulation () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSchemasInIndexDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSchemasInPrivilegeDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSchemasInProcedureCalls () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSchemasInTableDefinitions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSelectForUpdate () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsStatementPooling () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsStoredFunctionsUsingCallSyntax () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsStoredProcedures () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSubqueriesInComparisons () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSubqueriesInExists () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSubqueriesInIns () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsSubqueriesInQuantifieds () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsTableCorrelationNames () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsTransactionIsolationLevel (int level) throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsTransactions () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsUnion () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean supportsUnionAll () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new SQLException (msgMNI);
		}
	
	@Override
	public boolean updatesAreDetected (int type) throws SQLException {
		throw new SQLException (msgMNI);
		}
	
	@Override
	public boolean usesLocalFilePerTable () throws SQLException {
		throw new SQLException (msgMNI);
		}
		
	@Override
	public boolean usesLocalFiles () throws SQLException {
		throw new SQLException (msgMNI);
		}
					
	}
