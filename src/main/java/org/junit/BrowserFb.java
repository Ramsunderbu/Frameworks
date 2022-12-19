package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFb {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClassMe() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClassMe() {
//		driver.quit();

	}
	@Before
	public void before() {
		Date d =new Date();
		System.out.println("start time "+d);

	}
	@After
	public void after() {
		Date d =new Date();
		System.out.println("start time "+d);
	}
	@Test
	public void test() {
		WebElement txtUser = driver.findElement(By.id("mail"));
		txtUser.sendKeys("ramsunder");

	}
	@Test
	public void test1() {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123");

	}

}
