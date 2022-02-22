package org.framework;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.HomePojo;
import org.pojo.LoginPojo;

public class SeleniumFramework4 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		launchBrowser();
		maxBrowser();
		toPassURL("https://adactinhotelapp.com/");
		toImplicitWait();
		
		LoginPojo l=new LoginPojo();
		
		toInput(l.getTextUser(), excelRead(1, 0, "Sheet3"));
		toInput(l.getUserPassword(), excelRead(1, 1, "Sheet3"));
		buttonClick(l.getButtonclick());
		
		HomePojo h=new HomePojo();
		toSelectByVisible(h.getDropdown(), "Paris");
		
		
		
		
		
	}
	
	

}
