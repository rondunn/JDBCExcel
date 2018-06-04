
package JDBCExcel;

import java.util.zip.*;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

/**
 * This class implements the interface between JDBC and the .XLSX file.
 * @author ron
 */

public class ExcelReader {
	
	XMLInputFactory factory;
	ZipFile zipFile = null;
	Map<String,InputStream> zipMap;
	Map<String,String> sheetMap;
	Map<String,String> styleMap;
	String[] sharedStrings;
	XMLStreamReader sheetReader = null;
	
	/**
	 * Close the sheet reader.
	 * @throws Exception 
	 */
	
	public void closeSheet () throws Exception {
		if (sheetReader == null) return;
		sheetReader.close();
		sheetReader = null;
		}
	
	/**
	 * Close a workbook
	 * @throws Exception 
	 */
	
	public void closeWorkbook () throws Exception {
		closeSheet();
		if (zipFile != null) {
			zipFile.close();
			zipFile = null;
			}
		}
	
	/**
	 * Format the contents of a cell as a String
	 * @param value
	 * @param type
	 * @param style
	 * @return
	 * @throws Exception 
	 */
	
	private String formatCell (String value,String type,String style) throws Exception {
		
		String s = null;
		
		if (type == null) {
			
			if (style == null) s = value;
			else {

				String st = styleMap.get(style);
				List<String> dateTimeFormats = Arrays.asList ( "14","22","164","165","166","167","168","169","170","171","172","173","174","175" );
				if (dateTimeFormats.contains(st)) {

					SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
					Date date = sdf.parse("1900-01-01");

					Double dbl = new Double (value);
					int days = (int) Math.floor (dbl);
					Double secs = dbl - days;
					Integer seconds = (int) Math.round(secs * 86400);

					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					cal.add (Calendar.DATE,days-2);
					cal.add (Calendar.SECOND,seconds);

					sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					s = sdf.format(cal.getTime());

					}
				else s = value;
				}
			}
		else if (type.equals("s")) s = sharedStrings[Integer.parseInt(value)];
		else s = value;
		
		return s;
		}
	
	/**
	 * Helper function to get the attributes of a node.
	 * @param stream
	 * @return 
	 */

	private Map<String,String> getAttributes (XMLStreamReader stream) {
		Map<String,String> attributes = new HashMap<>();
		Integer count = stream.getAttributeCount();
		for (Integer i=0; i<count; ++i) {
			String name = stream.getAttributeLocalName(i);
			String value = stream.getAttributeValue(i);
			attributes.put (name,value);
			}
		return attributes;
		}
	
	/**
	 * Get the column reference from a cell reference.
	 * @param cellRef
	 * @return 
	 */
	
	public String getColumnRef(String cellRef) {
		if (cellRef == null || cellRef.equals("")) return null;
		String ref = "";
		char[] chars = cellRef.toCharArray();
		for (char ch: chars) {
			if (Character.isDigit(ch)) return ref;
			ref += ch;
			}
		return ref;
		}
		
	/**
	 * Get a list of the sheets in the current workbook.
	 * @return 
	 */
	
	public List<String> getSheetNames() {
		List<String> sheetNames = new ArrayList<>();
		for (String key: sheetMap.keySet()) sheetNames.add (key);
		Collections.sort(sheetNames);
		return sheetNames;
		}
	
	/**
	 * Get a stream reader for a sheet.
	 * @param sheet
	 * @return
	 * @throws Exception 
	 */
	
	private XMLStreamReader getStreamReader (String sheet) throws Exception {
		ZipEntry entry = zipFile.getEntry(sheet);
		InputStream is = zipFile.getInputStream(entry);
		XMLStreamReader streamReader = factory.createXMLStreamReader(is);
		return streamReader;
		}
	
	/**
	 * Open a worksheet by name
	 * @param sheetName
	 * @throws Exception 
	 */
	
	public void openSheet (String sheetName) throws Exception {
		String sheetPath = sheetMap.get(sheetName);
		sheetReader = getStreamReader (sheetPath);
		}
	
	/**
	 * Open a workbook by file name
	 * @param workbookFileName
	 * @throws Exception 
	 */
	
	public void openWorkbook (String workbookFileName) throws Exception {
		
		zipFile = new ZipFile (workbookFileName);
		factory = XMLInputFactory.newInstance();
		XMLStreamReader sr;
		
		// Map sheet names to numbers.
		
		sheetMap = new HashMap<>();
		sr = getStreamReader ("xl/workbook.xml");
		while (sr.hasNext()) {
			sr.next();
			if (sr.getEventType() == XMLStreamReader.START_ELEMENT) {
				String tag = sr.getLocalName();
				if (tag.equals("sheet")) {
					Map<String,String> attributes = getAttributes (sr);
					String sheetName = attributes.get("name");
					String sheetPath = "xl/worksheets/sheet" + attributes.get("id").substring(3) + ".xml";
					sheetMap.put(sheetName,sheetPath);
					}
				}
			}
		sr.close();

		// Map formatting styles
		
		styleMap = new HashMap<>();
		sr = getStreamReader ("xl/styles.xml");
		String xfs = "";
		Integer xfCount = 0;
		while(sr.hasNext()){
			sr.next();
			if(sr.getEventType() == XMLStreamReader.START_ELEMENT){
				String tag = sr.getLocalName();
				if (tag.equals("cellStyleXfs")) xfs = "cellStyle";
				else if (tag.equals("cellXfs")) xfs = "cell";
				else if (tag.equals("xf") && xfs.equals("cell")) {
					Map<String,String> attributes = getAttributes(sr);
					styleMap.put (xfCount.toString(),attributes.get("numFmtId"));
					++xfCount;
					}
				}
			}
		sr.close();
		
		// Load shared string table
		
		sr = getStreamReader ("xl/sharedStrings.xml");
		Integer i = 0;
		while(sr.hasNext()){
			sr.next();
			Integer eventType = sr.getEventType();
			if(eventType == XMLStreamReader.START_ELEMENT) {
				String tag = sr.getLocalName();
				if (tag.equals("sst")) {
					Map<String,String> attributes = getAttributes(sr);
					Integer uniqueCount = Integer.parseInt(attributes.get("uniqueCount"));
					sharedStrings = new String[uniqueCount];
					}
				else if (tag.equals("t")) {
					sr.next();
					String s = sr.getText();
					sharedStrings[i++] = s;
					}
				}
			}
		sr.close();

		}
	
	/**
	 * Get a map of reference/value for a row of cells.
	 * @return
	 * @throws Exception 
	 */
	
	public Map<String,String> getRow () throws Exception {
		
		String parentNode;
		String ref = "";
		String type = "";
		String style = "";
		String s = "";
		Map<String,String> result = new LinkedHashMap<>();
		
		while(sheetReader.hasNext()) {
			sheetReader.next();
			Integer eventType = sheetReader.getEventType();
			if(eventType == XMLStreamReader.START_ELEMENT) {
				String tag = sheetReader.getLocalName();
				if (tag.equals("c")) {
					Map<String,String> attributes = getAttributes(sheetReader);
					ref = getColumnRef(attributes.get("r"));
					type = attributes.get("t");
					style = attributes.get("s");
					while (!tag.equals("v")) {
						sheetReader.next();
						eventType = sheetReader.getEventType();
						if (eventType != XMLStreamReader.CHARACTERS) tag = sheetReader.getLocalName();
						}
					while (eventType != XMLStreamReader.CHARACTERS) {
						sheetReader.next();
						eventType = sheetReader.getEventType();
						}
					s = sheetReader.getText();
					s = formatCell (s,type,style);
					result.put (ref,s);
					}
				}
			else if (eventType == XMLStreamReader.END_ELEMENT) {
				String tag = sheetReader.getLocalName();
				if (tag.equals("row")) {
					return result;
					}
				}
			}
		
		return null;
		}

	/**
	 * Get map of ref/value for the cells in a sheet
	 * @return
	 * @throws Exception 
	 */
	
	public Map<String,String> getSheet () throws Exception {
		
		String parentNode;
		String ref = "";
		String type = "";
		String style = "";
		String s = "";
		Map<String,String> result = new HashMap<>();
		
		while(sheetReader.hasNext()) {
			sheetReader.next();
			Integer eventType = sheetReader.getEventType();
			if(eventType == XMLStreamReader.START_ELEMENT) {
				String tag = sheetReader.getLocalName();
				if (tag.equals("c")) {
					Map<String,String> attributes = getAttributes(sheetReader);
					ref = attributes.get("r");
					type = attributes.get("t");
					style = attributes.get("s");
					while (!tag.equals("v")) {
						sheetReader.next();
						eventType = sheetReader.getEventType();
						if (eventType != XMLStreamReader.CHARACTERS) tag = sheetReader.getLocalName();
						}
					while (eventType != XMLStreamReader.CHARACTERS) {
						sheetReader.next();
						eventType = sheetReader.getEventType();
						}
					s = sheetReader.getText();
					s = formatCell (s,type,style);
					result.put (ref,s);
					}
				}
			}
		
		return result;
		}
			
	}
