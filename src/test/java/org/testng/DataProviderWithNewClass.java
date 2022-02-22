package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.FBLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderWithNewClass extends BaseClass{
	
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
		Thread.sleep(2000);

	}
	
	@Test(dataProvider = "input", dataProviderClass = DPNewClass.class)
	private void tc1(String user, String pass) {
		FBLoginPojo f=new FBLoginPojo();
		toInput(f.getUserEmail(), user);
		toInput(f.getUserPassword(), pass);
		buttonClick(f.getLogin());

	}
	
	
}
