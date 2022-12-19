package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionEqual {
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeClassMe() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClassMe() {
		driver.quit();

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
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("ram");
		String actual = txtUserName.getAttribute("value");	
		Assert.assertEquals("Verify username textbox","Nisha@gmail.com", actual);

	}
	@Test
	public void test0() {
		
		WebElement txtUserName = driver.findElement(By.id("pass"));
		txtUserName.sendKeys("9600723020");
		String actual = txtUserName.getAttribute("value");	
		Assert.assertEquals("Verify username textbox","Nisha@gmail.com", actual);

	}
	@Test
	public void test1() {
		Assert.assertTrue("Verify test method", false);
		System.out.println("test1");

	}
	@Test
	public void test2() {
		Assert.assertEquals("Verify test method", "Nisha", "nisha");
		System.out.println("test2");

	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Verify test method", "Nisha", "Nisha");
		System.out.println("test4");

	}
	@Test
	public void test4() {
		Assert.assertEquals("Verify test method", 100,100);
		System.out.println("test3");

	}

}
