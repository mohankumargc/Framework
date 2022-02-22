package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class SeleniumFramework3 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\MagicalRingsT\\Desktop\\New folder\\Framework1\\Datas\\Book1.xlsx");
		
		FileInputStream f=new FileInputStream(file);
		
		Workbook w=new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				int cellType = c.getCellType();
				
				//if celltype==1 it will return string else other then 1 may be
				
				String value;
				
				
				if (cellType==1) {
					
					 value = c.getStringCellValue();
					
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {
				
					Date d = c.getDateCellValue();
					
					SimpleDateFormat s1=new SimpleDateFormat("dd/MM/YYYY");
					
					 value = s1.format(d);
					
				}
				
				else {
					
					double nv = c.getNumericCellValue();
					
					//Typecating
					
					long l=(long)nv;
					
					 value = String.valueOf(l);
					
					
				}
				
				System.out.println(value);
				
			}
			
		}
		
				
	}

}
