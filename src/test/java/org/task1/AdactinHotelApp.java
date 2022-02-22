package org.task1;

import java.io.IOException;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
			
		launchBrowser();
		maxBrowser();
		toPassURL("https://adactinhotelapp.com/index.php");
		
		WebElement userName = driver.findElement(By.id("username"));
		toInput(userName, excelRead(1, 0, "Sheet3"));
		
		
		WebElement userPass = driver.findElement(By.id("password"));
		toInput(userPass, excelRead(1, 1, "Sheet3"));
		
		
		WebElement button = driver.findElement(By.id("login"));
		buttonClick(button);
	
		Select s=new Select(driver.findElement(By.id("location")));
		s.selectByValue("Paris");
		
		Select s1=new Select(driver.findElement(By.id("hotels")));
		s1.selectByValue("Hotel Sunshine");
		
		Select s2=new Select(driver.findElement(By.id("room_type")));
		s2.selectByValue("Super Deluxe");
		
		Select s3=new Select(driver.findElement(By.id("room_nos")));
		s3.selectByValue("2");
		
		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		toInput(dateIn, excelRead(1, 2, "Sheet3"));
		
		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		toInput(dateOut, excelRead(1, 3, "Sheet3"));
		
		Select s4=new Select(driver.findElement(By.id("adult_room")));
		s4.selectByValue("4");
		
		Select s5=new Select(driver.findElement(By.id("child_room")));
		s5.selectByValue("2");
		
		buttonClick(driver.findElement(By.id("Submit")));
		
		
		buttonClick(driver.findElement(By.id("radiobutton_0")));
		
		buttonClick(driver.findElement(By.id("continue")));
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		toInput(firstName, excelRead(1, 4, "Sheet3"));
		
		toInput(driver.findElement(By.id("last_name")), excelRead(1, 5, "Sheet3"));
		
		toInput(driver.findElement(By.id("address")), excelRead(1, 6, "Sheet3"));
		
		toInput(driver.findElement(By.id("cc_num")), excelRead(1, 7, "Sheet3"));
		
		Select s6=new Select(driver.findElement(By.id("cc_type")));
		s6.selectByValue("VISA");
		
		Select s7=new Select(driver.findElement(By.id("cc_exp_month")));
		s7.selectByValue("2");
	
		Select s8=new Select(driver.findElement(By.id("cc_exp_year")));
		s8.selectByValue("2022");
		
		toInput(driver.findElement(By.id("cc_cvv")), excelRead(1, 8, "Sheet3"));
		
		buttonClick(driver.findElement(By.id("book_now")));
		
		Thread.sleep(5000);
		
		WebElement data = driver.findElement(By.id("order_no"));
		String attribute = data.getAttribute("value");
		System.out.println(attribute);
		
			
				
		
	}
	

}
