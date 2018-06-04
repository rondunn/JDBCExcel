
package JDBCExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.*;

public class SQL {
	
	// Parsed fragments
	List<String> colSelect;								// SELECT A,B,*,'literal',"alias",[alias]
	Map<String,String> colAlias;
	List<String> from;									// FROM table
	List<String> where;									// WHERE col > ?
	String limit;										// LIMIT 500
	
	Integer typeNumber;
	String	typeName;
	Integer typePrecision;
	Integer typeScale;
	
	public List<String> getTables() {
		return from;
		}
	
	public Integer getColumnCount() {
		return colSelect.size();
		}
	
	public List<String> getColumnList() {
		return colSelect;
		}
	
	public String getColumnLabel (Integer colNum) {
		String cn = this.colSelect.get(colNum-1);
		return Util.unQuote(getColumnLabel(cn));
		}
	
	public String getColumnLabel (String colName) {
		String l = this.colAlias.getOrDefault(colName,colName);
		return Util.unQuote(l);
		}
	
	public Integer getLimit () {
		if (limit == null) return Integer.MAX_VALUE;
		return Integer.parseInt(limit);
		}
	
	//--------------------------------------------------------------------------
	//	expand()					Expand list for wildcard scenarios.
	//--------------------------------------------------------------------------
	
	public void validate (List<String> cols) throws SQLException {
		List<String> selectExpanded = new ArrayList<>();
		if (cols == null || cols.isEmpty()) throw new SQLException ("Table has no columns.");
		for (String token: colSelect) {
			if (token.equals("*")) {
				for (String col: cols) {
					selectExpanded.add (col);
					this.colAlias.put (col,col);
					}
				}
			else {
				char ch = token.charAt(0);
				if (Character.isLetter(ch)) {
					if (!cols.contains(token)) throw new SQLException ("Column " + token + " not found.");
					}
				selectExpanded.add (token);
				}
			}
		colSelect = selectExpanded;
		}
	
	//--------------------------------------------------------------------------
	//	parse()						Parse a SQL query into its parts.
	//--------------------------------------------------------------------------
	
	public void parse (String sql) throws SQLException {
		
		this.colSelect = new ArrayList<>();
		this.colAlias = new HashMap<>();
		this.from = new ArrayList<>();
		this.where = new ArrayList<>();
		this.limit = null;
		
		List<String> tokens = new ArrayList<>();
		
		// Remove padding from statement, convert to array.
		sql = sql.trim().replaceAll ("\\s+"," ");
		char[] sqlChars = sql.toCharArray();

		// Tokenise statement array.
		String tok = "";
		Boolean inLiteral = false;
		for (char ch: sqlChars) {
			if (ch == ' ' || ch == ',') {
				if (inLiteral == true) tok = tok + ch;
				else if (tok.length() > 0) {
					tokens.add (tok);
					tok = "";
					}
				}
			else {
				if (ch == '[' || ch == ']') ch = '"';
				if (ch == '\'' || ch == '"') {
					inLiteral = inLiteral == false;
					}
				tok = tok + ch;
				}
			}
		if (tok.length() > 0) tokens.add(tok);
		
		// Assign tokens to clauses (select, from, where, etc.)
		String mode="";
		String lastSelect = "";
		Integer colNum = 0;
		for (String token: tokens) {
			if (token.equalsIgnoreCase("select")) mode = "select";
			else if (token.equalsIgnoreCase("as")) mode = "as";
			else if (token.equalsIgnoreCase("from")) mode = "from";
			else if (token.equalsIgnoreCase("where")) mode = "where";
			else if (token.equalsIgnoreCase("limit")) mode = "limit";
			else {
				if (mode.equalsIgnoreCase("select")) {
					this.colSelect.add (token);
					this.colAlias.put (token,token);
					lastSelect = token;
					++ colNum;					
					}
				else if (mode.equalsIgnoreCase("as")) {
					String s = Util.unQuote(token);
					this.colAlias.put (lastSelect,s);
					mode = "select";
					}
				else if (mode.equalsIgnoreCase("from")) {
					from.add(token);
					//System.err.println ("from " + token);
					}
				else if (mode.equalsIgnoreCase("where")) {
					where.add(token);
					//System.err.println ("where " + token);
					}
				else if (mode.equalsIgnoreCase("limit")) limit = token;
				}

			}
		
		// Validate query state.
		if (colSelect.size() < 1)	throw new SQLException ("No select columns.");
		if (from.size() != 1)	throw new SQLException ("Query must have 1xFROM table.");

		}
	
	//--------------------------------------------------------------------------
	
	public void parseType(String t) {
		
		String name = t.replace(" ","").toLowerCase();		
		Integer type;
		int precision = 0;
		int scale = 0;
		
		if (name.contains ("(")) {
			name = t.replace (")","");
			String parts[] = name.split ("[(]");
			name = parts[0];
			String size = parts[1];
			if (size.contains (",")) {
				parts = size.split ("[,]");
				precision = Integer.parseInt (parts[0]);
				scale = Integer.parseInt (parts[1]);
				}
			else { // 65536 is just a big number, not a limit.
				if (size.equals ("max")) precision = 65536;
				else precision = Integer.parseInt (size);
				}
			}
		
		if (name.startsWith("int")) {
			typeNumber = java.sql.Types.INTEGER;
			typeName = "integer";
			typeScale = null;
			typePrecision = null;
			}
		else if (name.startsWith("dec")) {
			typeNumber = java.sql.Types.DECIMAL;
			typeName = "decimal";
			typeScale = scale;
			typePrecision = precision;
			}
		else if (name.equals("date")) {
			typeNumber = java.sql.Types.DATE;
			typeName = "date";
			typeScale = null;
			typePrecision = null;
			}
		else if (name.equals("datetime")) {
			typeNumber = java.sql.Types.TIMESTAMP;
			typeName = "datetime";
			typeScale = null;
			typePrecision = null;
			}
		else if (name.equals("time")) {
			typeNumber = java.sql.Types.TIME;
			typeName = "time";
			typeScale = null;
			typePrecision = null;
			}
		else {
			typeNumber = java.sql.Types.NVARCHAR;
			typeName = "nvarchar";
			typeScale = scale;
			typePrecision = null;
			}

		}
	
	}
