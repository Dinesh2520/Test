package org.pojo;

import org.base.NewBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo extends NewBaseClass{

	
	
	public RedBusPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="(//input[@type='text'])[1]")
	private WebElement from;
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement desc;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getDesc() {
		return desc;
	}

}
