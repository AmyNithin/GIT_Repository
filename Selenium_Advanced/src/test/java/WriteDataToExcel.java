
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {


public static void main(String[] args) throws IOException{	
//Blank workbook	
XSSFWorkbook workbook=new XSSFWorkbook();

//Create a blank sheet
XSSFSheet sheet=workbook.createSheet("Test Data");
/*
 * creating array of objects single dimension
 */
Map<String,Object[]> data=new TreeMap<String,Object[]>(); //data is stored as key value pair in map

data.put("1",new Object[]{"ID","NAME","LASTNAME"});
data.put("2",new Object[]{1,"Amy","Nithin"});
data.put("3",new Object[]{2,"Ajas","VV"});
data.put("4",new Object[]{3,"Anees","Ibrahim"});
data.put("5",new Object[]{4,"Afsar","Muhammed"});

/*
 * Iterate over data and write to sheet
 */
Set<String> keyset=data.keySet();//data.KeySet gives the key set in the Map which is 1,2,3,4

int rownum=0;
for(String key:keyset){
	
Row row=sheet.createRow(rownum++);	//one row gets created

Object[] objArr=data.get(key);	//get the lst key from map and store in in a array of object which is single dimensional
	
int cellnum=0;
/*
 * iterating over objArray which stores keys
 */
for(Object obj:objArr)
{
	
Cell cell=row.createCell(cellnum++);

if(obj instanceof String)
	cell.setCellValue((String)obj);
else if(obj instanceof Integer)
	cell.setCellValue((Integer)obj);
}}

try {
	FileOutputStream out=new FileOutputStream(new File("demo.xlsx"));

    workbook.write(out);

    out.close();
    System.out.println("demo.xls written successfully on disk");



} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}

}

}