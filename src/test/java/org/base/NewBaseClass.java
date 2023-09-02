package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBaseClass {
	public static WebDriver driver;
	
	
	public static void launchabrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}
	
	
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public static void windowMax() {
		driver.manage().window().maximize();

		
	}
	
	@SuppressWarnings("deprecation")
	public static void implicitwait() {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static void fillText(WebElement element , String text) {

		element.sendKeys(text);

	}
	
	public static void buttonClick(WebElement element) {
		element.click();

	}
	public static void closeBrowser() {
		driver.close();

		
	}
	
	

}
