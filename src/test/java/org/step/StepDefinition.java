

package org.step;

import java.util.List;
import java.util.Map;

import org.base.NewBaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.FbForgottenPojo;
import org.pojo.FbloginPojo;
import org.pojo.RedBusPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends NewBaseClass {
	
	FbloginPojo p;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("user have to check forgot")
	public void userHaveToCheckForgot() {
	    
	}

	@When("user have click the forgotten pass")
	public void userHaveClickTheForgottenPass() {
	   
	}

	@When("user have enter email add")
	public void userHaveEnterEmailAdd() {


	}

	@Then("user have click the search")
	public void userHaveClickTheSearch() {
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//multi dimensional map
	
	
	
	
	@When("user have got the valid datas from feature file")
	public void user_have_got_the_valid_datas_from_feature_file(io.cucumber.datatable.DataTable d) throws InterruptedException {
	    List<Map<String, String>> allDatas = d.asMaps(String.class, String.class);
	    String email = allDatas.get(2).get("Phoneno");
	    String pass = allDatas.get(0).get("Username");
	    p = new FbloginPojo();
	    WebElement emailbox = p.getEmail();
	    fillText(emailbox, email);
	    Thread.sleep(4000);
	    WebElement passbox = p.getPass();
	    fillText(passbox, pass);
	    Thread.sleep(4000);
	}

	@Then("user have click the login button after entering\"")
	public void user_have_click_the_login_button_after_entering() {
	    
	
		//Assert.asset
		 p = new FbloginPojo();
		 WebElement loginbtn = p.getLoginbtn();
	    buttonClick(loginbtn);
	}
	
	
	
	
	
	
	
	//single dimensional map
	
	
	
	
	
	@When("user have get valid datas from feature file")
	public void user_have_get_valid_datas_from_feature_file(io.cucumber.datatable.DataTable d) throws InterruptedException {
	    Map<String, String> allDatas = d.asMap(String.class, String.class);
	    String emailvalue = allDatas.get("Email");
	    String passvalue = allDatas.get("Pass");
	    p = new FbloginPojo();
	    WebElement emailbox = p.getEmail();
	    fillText(emailbox, emailvalue);
	    Thread.sleep(4000);
	    WebElement passbox = p.getPass();
	    fillText(passbox, passvalue);
	    Thread.sleep(4000);
	    
	}

	@Then("user have click the login button after entering data")
	public void user_have_click_the_login_button_after_entering_data() {
		
		 p = new FbloginPojo();
		 WebElement loginbtn = p.getLoginbtn();
	    buttonClick(loginbtn);
	}
	
	
	

	
	
	
	
	
	//multi dimensional list
	
	
	@When("user have enter invalid username data and Invalid pass data")
	public void user_have_enter_invalid_username_data_and_Invalid_pass_data(io.cucumber.datatable.DataTable d) throws InterruptedException {
	   List<List<String>> allData = d.asLists();
	   p = new FbloginPojo();
	   String emaillist = allData.get(1).get(2);
	   String passlist = allData.get(2).get(3);
	   
	   WebElement email = p.getEmail();
	   fillText(email, emaillist);
	   Thread.sleep(5000);
	   WebElement pass = p.getPass();
	   fillText(pass, passlist);
	   Thread.sleep(4000);
	}

	@Then("user have clicked the login button")
	public void user_have_clicked_the_login_button() {
	    
		
		 p = new FbloginPojo();
		 WebElement loginbtn = p.getLoginbtn();
		 buttonClick(loginbtn);
	}
	
	
	
	
	
	
	
	
	//Single dimensional list
	

@When("user have enter valid username data in and Invalid pass data")
public void user_have_enter_valid_username_data_in_and_Invalid_pass_data(io.cucumber.datatable.DataTable d) throws InterruptedException {
    List<String> list = d.asList();
    String email = list.get(2);
    String pass = list.get(1);
    p = new FbloginPojo();
    WebElement emailbox = p.getEmail();
    fillText(emailbox, email);
    Thread.sleep(4000);
    WebElement passbox = p.getPass();
    fillText(passbox, pass);
    Thread.sleep(4000);
}

@Then("user have click the login button")
public void user_have_click_the_login_button() {
	 p = new FbloginPojo();
	WebElement loginbtn = p.getLoginbtn();
	buttonClick(loginbtn);
    
}
	
	
	


	
	
	//RebBus methods
	
	@Given("user have entered redbus through chrome browser")
	public void user_have_entered_redbus_through_chrome_browser() {
		   launchabrowser();
		   loadUrl("https://www.redbus.in/");
		   windowMax();
		   waitsImplicity();
	}

	private void waitsImplicity() {
		// TODO Auto-generated method stub
		RedBusPojo red = new RedBusPojo();
		WebElement from = red.getFrom();
		fillText(from, "Chennai");
		 WebElement des = red.getDesc();
		   fillText(des, "Trichy");
		
	}

	@When("user have enter valid credentials in from, to textbox and calenderBox")
	public void user_have_enter_valid_credentials_in_from_to_textbox_and_calenderBox() {
	    
	}

	@When("user have click the search bus button")
	public void user_have_click_the_search_bus_button() {
	    
	}

	@When("user have click the bus seats from the list of different buses")
	public void user_have_click_the_bus_seats_from_the_list_of_different_buses() {
	   
	}

	@When("user have to click the required seats which are shown available")
	public void user_have_to_click_the_required_seats_which_are_shown_available() {
	    
	}

	@When("user have to click the boarding point and dropping point and click proceed to book")
	public void user_have_to_click_the_boarding_point_and_dropping_point_and_click_proceed_to_book() {
	    
	}

	@When("user have to enter valid credentials in all textbox, radio button and age")
	public void user_have_to_enter_valid_credentials_in_all_textbox_radio_button_and_age() {
	    
	}

	@When("user have to click proceed to pay button")
	public void user_have_to_click_proceed_to_pay_button() {
	    
	}

	@When("user have to choose valid payment method")
	public void user_have_to_choose_valid_payment_method() {
	    
	}

	@Then("user have reach the valid credentials page")
	public void user_have_reach_the_valid_credentials_page() {
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//forgotten methods
	
	@Given("user have to check forgotten password through chrome browser")
	public void user_have_to_check_forgotten_password_through_chrome_browser() {
	   launchabrowser();
	   loadUrl("https://www.facebook.com/");
	   windowMax();
	   implicitwait();
	}

	@When("user have click the forgotten password")
	public void user_have_click_the_forgotten_password() {
		 FbForgottenPojo p = new FbForgottenPojo();
		    List<WebElement> frgtpass = p.getFrgtpass();
		    WebElement webElement = frgtpass.get(1);
		   buttonClick(webElement);
	}

	@When("user have enter email address")
	public void user_have_enter_email_address() {
		 FbForgottenPojo p = new FbForgottenPojo();
		  WebElement emailbox = p.getEmailbox();
		fillText(emailbox, "Raina");
	}

	@Then("user have click the search button in forgotten pass")
	public void user_have_click_the_search_button_in_forgotten_pass() {
		 FbForgottenPojo p = new FbForgottenPojo();
		 WebElement searchbtn = p.getSearchbtn();
		 buttonClick(searchbtn);
	}

}

