package org.pojo;

import java.util.List;

import org.base.NewBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbForgottenPojo extends NewBaseClass{

	
	
	public FbForgottenPojo() {
		PageFactory.initElements(driver, this);
	
	}
	
	//Webelements
		@FindBy(tagName = "a")
		private List<WebElement> frgtpass;

		@FindBy(xpath ="//input[@placeholder='Email address or mobile number']")
		private WebElement emailbox;

		@FindAll({ 
		       @FindBy(xpath = "//button[@type='submit']"), 
		       @FindBy(name = "passs") })

	    private WebElement searchbtn;

		/**
		 * @return the frgtpass
		 */
		public List<WebElement> getFrgtpass() {
			return frgtpass;
		}

		

		/**
		 * @return the emailbox
		 */
		public WebElement getEmailbox() {
			return emailbox;
		}



		/**
		 * @return the searchbtn
		 */
		public WebElement getSearchbtn() {
			return searchbtn;
		}

}
