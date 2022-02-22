package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert extends BaseClass{
	
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
	private void tc1() {
		
		String url= driver.getCurrentUrl();
	
		org.testng.asserts.SoftAssert s=new org.testng.asserts.SoftAssert();
		
		s.assertTrue(url.contains("sdfsdf"), "check the url");
		
		driver.findElement(By.id("email")).sendKeys("java");
		
		s.assertEquals("java", "dsfsdsdf", "check the username");
		
		driver.findElement(By.id("pass")).sendKeys("java@123");
		
		driver.findElement(By.name("login")).click();
		
		String url1 = driver.getCurrentUrl();
		
		s.assertTrue(url1.contains("dsfsdfsdfs"), "check the url of the error page");
		
		System.out.println("Done");
		
	}
	
	
}
