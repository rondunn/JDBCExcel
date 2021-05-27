package JDBCExcel;

import java.util.ArrayList;
import java.util.List;

public class XmlPath {
	private List<String> pathList;
	
	public XmlPath() {
		pathList = new ArrayList<String>();
	}
	
	public void add(String tag) {
		pathList.add(tag);
	}
	
	public String remove(String tag) {
		int size = pathList.size();
		if (size == 0 || !pathList.get(size - 1).equals(tag))
			throw new IllegalArgumentException("Tag " + tag + " not found at end of path");
		return pathList.remove(size - 1);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (String string : pathList) {
			sb.append("/");
			sb.append(string);
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof XmlPath))
			return false;
		XmlPath other = (XmlPath) o;
		return pathList.equals(other.pathList);
	}
	
	@Override
	public int hashCode() {
		return pathList.hashCode();
	}
}
