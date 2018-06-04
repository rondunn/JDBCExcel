
package JDBCExcel;

import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class Util {
	
	static public Map<String,String> parseUrl (String urlString) throws SQLException {
		
		if (urlString == null) throw new SQLException ("parseURL: Null URL not permitted.");
		
		urlString = urlString.trim();
		if (urlString.equals("")) throw new SQLException ("parseURL: Empty URL not permitted.");
		
		int i = urlString.indexOf("://");
		if (i == -1) throw new SQLException ("parseURL: Invalid format.");
		
		String query = urlString.substring(i+3);
		if (query == null || query.equals("")) throw new SQLException ("parseURL: No parameters to parse.");

		Map<String,String> props = new HashMap<>();
		String avps[] = query.split (";");
		for (String av: avps) {
			if (av.contains("=")) {
				String a[] = av.split("=");
				props.put (a[0].toUpperCase().trim(),a[1].trim());
				}
			}

		return props;
		}
		
	//--------------------------------------------------------------------------
	//	sqlLikeToRegex()			Convert a pattern in SQL LIKE format to a
	//								Java regular expression.
	//--------------------------------------------------------------------------
	
	public static String sqlLikeToRegex (String pattern) {
		
		if (pattern == null) return ".*";
		
		StringBuilder out = new StringBuilder("^");
		
		for(int i = 0; i < pattern.length(); ++i) {
			final char c = pattern.charAt(i);
			switch(c) {
				case '%': out.append(".*"); break;
				case '_': out.append('.'); break;
				case '.': out.append("\\."); break;
				case '\\': out.append("\\\\"); break;
				default: out.append(c);
				}
			}
		
		out.append('$');
		return out.toString();
		}
	
	//--------------------------------------------------------------------------
	//	unQuote()					Remove the quoted literal and object name
	//								delimiters from a string.
	//--------------------------------------------------------------------------
	
	public static String unQuote (String s) {
		if (s == null || s.equals("")) return s;
		String returnValue = s;
		if (s.startsWith("'") || s.startsWith("\"") || s.startsWith("[")) returnValue = s.substring(1,s.length()-1); 
		return returnValue;
		}
	
	}
