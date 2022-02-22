package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends BaseClass{
	
	public HomePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	
	
	

}
