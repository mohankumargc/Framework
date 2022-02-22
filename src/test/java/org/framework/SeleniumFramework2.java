package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class SeleniumFramework2 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		//////////////////////////////////////////////////////////
		//concept 1
		/////////////////////////////////////////////////////////
		// 1.Mention the location
		
		//File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");
		
		// 2.FileInputsStream which is used for read the file location
		
		//FileInputStream f=new FileInputStream(file);
		
		// 3.Workbook Instanciation
		
		//Workbook w=new XSSFWorkbook(f);
		
		// to get the particular sheet from the workbook
		//Sheet s = w.getSheet("Sheet1");
		
		// to get the particular row from the sheet1
		//Row r = s.getRow(2);
		
		// to get the particular cell from the row
		//Cell c = r.getCell(1);
		
		//System.out.println(c);
		
		//System.out.println("Done");
		
//////////////////////////////////////////////////////////
//concept 2
/////////////////////////////////////////////////////////
		// 1.Mention the location
		
		//File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");
		
		// 2.FileInputsStream which is used for read the file location
		
		//FileInputStream f=new FileInputStream(file);
		
		// 3.Workbook Instanciation
		
		//Workbook w=new XSSFWorkbook(f);
		
		// to get the particular sheet from the workbook
		//Sheet s = w.getSheet("Sheet1");
		
		//looping 
	//	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
		//	Row r = s.getRow(i);
			
			//for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			//	Cell cell = r.getCell(j);
			//	System.out.println(cell);
			//}
			
			
			
		//}
		
		
////////////////////////////////////////////////////////////
////concept 3 print only row count and cell count
///////////////////////////////////////////////////////////
//// 1.Mention the location
//
//		File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");
//
//// 2.FileInputsStream which is used for read the file location
//
//		FileInputStream f=new FileInputStream(file);
//
//// 3.Workbook Instanciation
//
//		Workbook w=new XSSFWorkbook(f);
//
//// to get the particular sheet from the workbook
//		Sheet s = w.getSheet("Sheet1");
//	
//		int s1 = s.getPhysicalNumberOfRows();
//		System.out.println(s1);
//		
//		Row row = s.getRow(2);
//		int r = row.getPhysicalNumberOfCells();
//		System.out.println(r);
		
		
//////////////////////////////////////////////////////////
// Allconcept printing here
/////////////////////////////////////////////////////////
		
//1.Mention the location

		File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");

//2.FileInputsStream which is used for read the file location

		FileInputStream f=new FileInputStream(file);

//3.Workbook Instanciation

		Workbook w=new XSSFWorkbook(f);

//to get the particular sheet from the workbook
		Sheet s = w.getSheet("Sheet1");

		int s1 = s.getPhysicalNumberOfRows();
		System.out.println(s1);

		Row row = s.getRow(2);
		int r = row.getPhysicalNumberOfCells();
		System.out.println(r+"\n");
		
///////////		
		Row row2 = s.getRow(3);
		Cell cell = row2.getCell(2);
		System.out.println(cell+"\n");
		
////////////		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row3 = s.getRow(i);
			for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row3.getCell(j);
				System.out.println(cell2);
				
			}
		}
		
		

 	
		

		
		
	}

}
