package org.framework;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumFramework extends BaseClass{
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		maxBrowser();
		
		toPassURL("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		toInput(userName, "mohankumargc@gmail.com");
		
		WebElement userPass = driver.findElement(By.id("pass"));
		toInput(userPass, "12346789");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Log In']"));
		buttonClick(button);
		
		
		
		
	}

}
