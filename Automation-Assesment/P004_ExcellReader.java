package Assesment;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Basic.ExcellReader;
import connection.DriverConnection;
public class P004_ExcellReader {
	
		
	public P004_ExcellReader(String filepath,String sheetName ) {
		super();
		this.filepath = filepath;
		this.sheetName = sheetName;
		
	}
	String filepath;
	String sheetName;
		public int rowcount() {
			int i=0;
			try {
				XSSFWorkbook workbook=new XSSFWorkbook(filepath);
				XSSFSheet worksheet= workbook.getSheet(sheetName);
				i=worksheet.getPhysicalNumberOfRows();
			} catch (Exception e) {
				// TODO: handle exception
			}
			return i;
			
		}
		public int colcount() {
			int i=0;
			try {
				XSSFWorkbook workbook=new XSSFWorkbook(filepath);
				XSSFSheet worksheet =workbook.getSheet(sheetName);
				i=worksheet.getRow(0).getPhysicalNumberOfCells();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return i;
		}
		
		public String getData(int row ,int col) {
			String data =null;
			try {
				XSSFWorkbook workbook=new XSSFWorkbook(filepath);
				XSSFSheet worksSheet =workbook.getSheet(sheetName);
				data=worksSheet.getRow(row).getCell(col).getStringCellValue();
				System.out.println(data);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return data;
		}
	


	}



