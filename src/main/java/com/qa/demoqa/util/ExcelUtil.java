package com.qa.demoqa.util;


/**
 * @author SurajAnand
 *
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	
	static String sheetPath = "./src/main/java/com/qa/demoqa/testdata/DemoQATest_TestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static void main(String[] args) {
		getTestData("Sheet1");
	}
	
	public static Object[][] getTestData(String sheetName) {
		
		Object data[][] = null;
		try {
			FileInputStream  ip = new FileInputStream(sheetPath);
			try {
				book = WorkbookFactory.create(ip);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			sheet = book.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			
			System.out.println(rowCount);
			System.out.println(colCount);
			data = new Object[rowCount][colCount];
			
			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					data[i][j] = sheet.getRow(i+1).getCell(j).toString();
					//System.out.println(data[i][j]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	
	
	
}
