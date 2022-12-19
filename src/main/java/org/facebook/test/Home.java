package org.facebook.test;

import org.facebook.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.resources.LibGlobal;

public class Home extends LibGlobal {
	HomePage home;
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://www.facebook.com/");	

	}
	@AfterClass
	public static void afterClass() {
//		quit();

	}
	@Test
	public void test() {
		home=new HomePage();
//		home.logintoPage("Nisha@gmail.com", "1234");
		driver.navigate().refresh();
//		home.logintoPage("Nisha", "123");
	}
	@Test
	public void test1() {
//		home.validateForgottenPassword();

	}

}
