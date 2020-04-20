package io.duotech.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.mk_latn.No;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {

		
		
		FileInputStream file = new FileInputStream("file.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		XSSFRow headerRow=sh.getRow(0);
		
		Cell c=headerRow.getCell(3);
		System.out.println(c.toString());
		
		int noOfColums = headerRow.getLastCellNum();
		System.out.println(noOfColums);
		
		int noOfRows = sh.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		
		
		for (int i = 1; i < noOfRows; i++) {
			
			System.out.println("First name column -> "+	i+". "+sh.getRow(i).getCell(2));
				
			
			
		}
		
		
		
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColums; j++) {
				
				Cell eachCell= sh.getRow(i).getCell(j);
				System.out.print(eachCell+ "\t ");
				
			}System.out.println();
			
		}
		Row r = sh.getRow(2);
		Cell ch = r.getCell(1);
		ch.setCellValue("Rose");
		
		FileOutputStream fos = new FileOutputStream("file.xlsx");
		wb.write(fos);
		fos.close();
		
		
		wb.close();
		
	}

}
