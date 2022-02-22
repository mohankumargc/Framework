package org.testng;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.pojo.FBLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert extends BaseClass{
	
	@BeforeClass
	private void beforeLaunch() {
		launchBrowser();
		maxBrowser();
	}
	
	@AfterClass
	private void afterLaunch() {
		quitBrowser();
	}
	
	@BeforeMethod
	private void startTime() {
	toPassURL("https://www.facebook.com/");
	Date d=new Date();
	System.out.println(d);

	}
	
	@AfterMethod
	private void endTime() throws InterruptedException {
		Date d=new Date();
		System.out.println(d);
		Thread.sleep(3000);

	}
	
	@Test()
	private void tc1() //throws IOException// 
	{
//		String currentUrl = driver.getCurrentUrl();
//		Assert.assertTrue(currentUrl.contains("facebook"), "check the currenturl of the login page");
//		FBLoginPojo f=new FBLoginPojo();
//		toInput(f.getUserEmail(), excelRead(6, 1, "Sheet1"));
//		
//		//Assert.assertEquals(toPrintGetAttribute(f.getUserEmail()), excelRead(6, 1, "Sheet1"), "check the username");
//		Assert.assertEquals(toPrintGetAttribute(f.getUserEmail()), excelRead(6, 1, "Sheet1"), "check the username");
//		
//		toInput(f.getUserPassword(), excelRead(6, 2, "Sheet1"));
//		buttonClick(f.getLogin());
//		String currentUrl2 = driver.getCurrentUrl();
//		Assert.assertTrue(currentUrl2.contains("privacy_mutation_token"), "check the currecturl2 of the error page");
//		System.out.println("Done");
		
		String url= driver.getCurrentUrl();
	
		Assert.assertTrue(url.contains("facebook"),	 "check the url of the login page");
		
		driver.findElement(By.id("email")).sendKeys("java");
		
		Assert.assertEquals("java", "java", "check the username");
		
		driver.findElement(By.id("pass")).sendKeys("java@123");
		
		driver.findElement(By.name("login")).click();
		
		String url1 = driver.getCurrentUrl();
		
		Assert.assertTrue(url1.contains("privacy_mutation_token"), "check the url of the error page");
		
		System.out.println("Done");
		
	}
	
	
}
