package org.junit;

import java.util.Date;
import java.util.List;

import org.base.BaseCl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinPg {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClassM() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	

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
		WebElement txtxUserName = driver.findElement(By.id("username"));
		txtxUserName.sendKeys("ramsunderbu93");
	}
	@Test
	public void test1() {
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("MFX11H");

	}
	@Test
	public void test3() {
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();

	}
	@Test
	public void test4() {
		WebElement btnClick1 = driver.findElement(By.id("location"));
		Select s =new Select(btnClick1);
		s.selectByVisibleText("Sydney");
		btnClick1.click();
	}
	@Test
	public void test5() {
		WebElement btnClick2 = driver.findElement(By.id("hotels"));
		Select s =new Select(btnClick2);
		s.selectByVisibleText("Hotel Sunshine");
		btnClick2.click();
	}
	@Test
	public void test6() {
		WebElement btnClick3 = driver.findElement(By.id("room_type"));
		Select s =new Select(btnClick3);
		s.selectByVisibleText("Deluxe");
		btnClick3.click();
	}
	@Test
	public void test7() {
		WebElement btnClick4 = driver.findElement(By.id("room_nos"));
		Select s =new Select(btnClick4);
		s.selectByVisibleText("3 - Three");
		btnClick4.click();
	}
	@Test
	public void test8() {
		WebElement btnClick5 = driver.findElement(By.id("adult_room"));
		Select s =new Select(btnClick5);
		s.selectByVisibleText("2 - Two");
		btnClick5.click();
	}
	@Test
	public void test9() {
		WebElement btnClick6 = driver.findElement(By.id("child_room"));
		Select s =new Select(btnClick6);
		s.selectByVisibleText("1 - One");
		btnClick6.click();
	}
	@Test
	public void test10() {
		WebElement btnClick7 = driver.findElement(By.id("Submit"));
		btnClick7.click();
	}


}
