package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionAdactLogin {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("adactin");
		System.out.println(contains);
		
		Assert.assertTrue(contains);
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("ramsunderbu93");
		
		String attribute = txtUser.getAttribute("value");
		Assert.assertEquals(attribute, "ramsunder");
		
		WebElement txtxPass = driver.findElement(By.id("password"));
		txtxPass.sendKeys("MFX11H");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

}
