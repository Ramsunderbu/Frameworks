package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	@Test(dataProvider="signup")
	public void singUp(String first, String last, long phone, String pass) {
		System.out.println("first name is "+first);
		System.out.println("first name is "+last);
		System.out.println("first name is "+phone);
		System.out.println("first name is "+pass);
		System.out.println("*****");
		

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
