package org.pojo;

import org.base.NewBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPojo extends NewBaseClass{
	
	
	public FbloginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement email;
	
	
	@FindBy(id="pass")
	private WebElement pass;
	
	
	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}


	/**
	 * @return the pass
	 */
	public WebElement getPass() {
		return pass;
	}


	/**
	 * @return the loginbtn
	 */
	public WebElement getLoginbtn() {
		return loginbtn;
	}


	@FindBy(name="login")
	private WebElement loginbtn;

}
