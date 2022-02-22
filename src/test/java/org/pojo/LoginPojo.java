package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	
	private WebElement textUser;

	public WebElement getTextUser() {
		return textUser;
	}	
	
	@FindBy(id="password") 
	
	private WebElement userPassword;

	public WebElement getUserPassword() {
		return userPassword;
	}
	
	@FindBy(id="login")
	
	private WebElement buttonclick;

	public WebElement getButtonclick() {
		return buttonclick;
	}
	
	
	
	
	

}
