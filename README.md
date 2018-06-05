# JDBCExcel

Read-only JDBC driver for Microsoft Excel .xlsx files

* Streaming reader, supports maximum Excel file sizes.
* No dependencies other than standard Java libraries.
* High performance for ETL / ELT scenarios

The conceptual mapping between spreadsheet and JDBC is:

* A server is a folder containing one or more spreadsheets
* A database is a single spreadsheet
* A table is a worksheet with a spreadsheet
* Columns are the columns of a worksheet
* Rows are the rows of a worksheet
* All values are returned as Strings

The sample file chinook.xlsx contains a spreadsheet of the type readable by this driver.

## Connection String

    jdbc:JDBCExcel://server={SERVER};database={DATABASE}
    
where

    {SERVER} = path name to folder containing one or more Excel .xlsx files
    {DATABASE} = name of an Excel .xlsx file
    
## SQL Queries

This driver accepts simple single-table queries of the following form:

    select a,b,*,'literal',[quoted name 1],"quoted name 2" as quote2
    from tableName
    limit 500
    
Calculations, where clauses, joins and other query elements are not currently supported.
