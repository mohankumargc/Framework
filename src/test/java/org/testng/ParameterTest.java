package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest extends BaseClass{
	
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
		
		toPassURL("https://adactinhotelapp.com/");
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Parameters({"username","password"})
	@Test
	private void tc1(@Optional("mohan") String user, @Optional("13246") String pass) {
		LoginPojo l=new LoginPojo();
		toInput(l.getTextUser(), user);
		toInput(l.getUserPassword(), pass);
		buttonClick(l.getButtonclick());

	}

}
