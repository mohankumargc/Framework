package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPojo extends BaseClass {
	
	public FBLoginPojo() {
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id="email")
	private WebElement userEmail;
	public WebElement getUserEmail() {
	return userEmail;
	}
	
	@FindBy(id="pass")
	private WebElement userPassword;
	public WebElement getUserPassword() {
	return userPassword;
	}
	
	@FindBy(name="login")
	private WebElement login;
	public WebElement getLogin() {
	return login;
	}
	
	
	

}
