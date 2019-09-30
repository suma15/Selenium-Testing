package com.Exceloperationformutipledata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_operations_Moredata {
	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
	FileInputStream file = new FileInputStream("C:\\Users\\LiveTech\\Desktop\\Testing\\WebApplicationsJava\\src\\com\\Exceloperationformutipledata\\mutipletestdata.xlsx") ;
	
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		workbook.close();
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowscount = sheet.getLastRowNum();
		System.out.println(rowscount);
		for (int i =0;i<=rowscount;i++)
		{
			Row row = sheet.getRow(i);
			
			int cellcount = row.getLastCellNum();
			
			for(int k =0;k<cellcount;k++)
				
			{
				Cell cell = row.getCell(k);
				String data = cell.getStringCellValue();
				
				System.out.print(data + " ");
			}
			
			System.out.println();
		}
	}

}
