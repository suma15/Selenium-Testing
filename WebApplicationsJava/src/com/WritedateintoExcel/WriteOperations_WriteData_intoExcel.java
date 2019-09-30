package com.WritedateintoExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperations_WriteData_intoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file = new FileInputStream("./src/com/WritedateintoExcel/writedata.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
	
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
  Row row = sheet.createRow(3);
Cell cell = row.createCell(2);
cell.setCellValue("Testing");

FileOutputStream File1 = new FileOutputStream("./src/com/WritedateintoExcel/writedata.xlsx");
workbook.write(File1);
	
	}

}
