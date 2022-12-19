package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvoideFrameIntegr {
	@Test(dataProvider="signup")
	public void singUp(String first, String last, long phone, String pass) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement txtFrist = driver.findElement(By.name("firstname"));
		txtFrist.sendKeys(first);
		WebElement txtLast = driver.findElement(By.name("lastname"));
		txtLast.sendKeys(last);
		WebElement txtPhone = driver.findElement(By.name("reg_email__"));
		txtPhone.sendKeys(String.valueOf(phone));
		WebElement txtPass = driver.findElement(By.name("reg_passwd__"));
		txtPass.sendKeys(pass);
		

	}
	@DataProvider(name="signup")
	public Object[][] data() {
		return new Object[][]{
			{"Ram","sunder",9600723020l,"ram@123"},
			{"Bala","murugan",7845047820l,"bala@123"},
			{"venkat","lr",9566671744l,"venkat@123"},
			
		};
	}
}
