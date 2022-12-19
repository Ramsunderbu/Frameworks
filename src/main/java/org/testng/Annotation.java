package org.testng;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Browser cofiguration launch");
	}
	@AfterClass
	public void afterClass() {
	   System.out.println("close/quit browser");

	}
	@BeforeMethod
	public void beforeEachMethod() {
		Date d=new Date();
		System.out.println("start time "+d);

	}
	@AfterMethod
	public void afterEachMethod() {
		Date d=new Date();
		System.out.println("start time "+d);

	}
	@Test
	public void tc1() {

		System.out.println("tc 1..");

	}
	@Test
	public void tc2() {

		System.out.println("tc 2..");

	}
	@Test
	public void tc3() {

		System.out.println("tc 3..");

	}

	

}
