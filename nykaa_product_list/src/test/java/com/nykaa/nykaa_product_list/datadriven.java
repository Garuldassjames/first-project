package com.nykaa.nykaa_product_list;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {


		public static String workboook(int a,int b) throws IOException {
		File fi = new File("C:\\Users\\Dell\\Desktop");
		FileInputStream fis = new FileInputStream(fi);
		
		Workbook wb = new XSSFWorkbook(fis);
//		Sheet sheetAt = wb.getSheetAt(0);
		Sheet sheetAt = wb.getSheet("facebook");
		Row row = sheetAt.getRow(a);
		Cell cell = row.getCell(b);
		CellType cellType = cell.getCellType();
		
		String stringCellValue = null;
		if (cellType.equals(cellType.STRING)) {
			stringCellValue = cell.getStringCellValue();
			System.out.println("stringCellValue "+ stringCellValue);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("numericCellValue "+ numericCellValue);
		}
		return stringCellValue;
		}
	
}
