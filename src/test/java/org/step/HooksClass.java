package org.step;

import org.base.NewBaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends NewBaseClass{

	
	
	
	
	@Before(order =1) 
	public static void beforeclass() {
		System.out.println("Before hooks");
		System.out.println("Browser launching");
		
		
	}
	
	@Before(order =2) 
	public static void beforeclass1() {
		
		launchabrowser();
		loadUrl("https://www.facebook.com/");
		
		
	}
	@Before(order =3) 
	public static void beforeclass2() {
		
		windowMax();
		implicitwait();
		
	}
	
	
	@After(order =3) 
	public static void afterclass() {
		System.out.println("after hooks");
		
		
		

	}
	@After(order =2) 
	public static void afterclass1() {
		
		System.out.println("Closed the browser");
		

	}
	@After(order =1) 
	public static void afterclass2() {
		closeBrowser();

	}
}
