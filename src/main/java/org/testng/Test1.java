package org.testng;

import org.testng.annotations.Test;

public class Test1 {
	@Test(priority =-2)
	public void tc1() {

		System.out.println("tc 1..");

	}
	@Test(priority =-1)
	public void tc2() {

		System.out.println("tc 2..");

	}
	@Test			
	public void tc3() {

		System.out.println("tc 3..");

	}

}
