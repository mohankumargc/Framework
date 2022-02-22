package org.framework;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumFramework3UsingBaseClass extends BaseClass{
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		maxBrowser();
		toPassURL("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		toInput(userName, excelRead(0, 1, "Sheet2"));
		
		
		WebElement userPass = driver.findElement(By.id("pass"));
		toInput(userPass, excelRead(0, 2, "Sheet2"));
		
	}
	
}
