package org.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	
	public static WebDriver driver;
	
	public static void getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	
	}
	public static void loadUrl(String url) {
		driver.get(url);

	}
	public static void insertValueInTextBox(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static String fetchUrl() {
		return driver.getCurrentUrl();
	}
	public static void quit() {
		driver.quit();
	}
	

}
