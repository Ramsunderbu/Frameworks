package org.testng;

import org.testng.annotations.Test;

public class Prio {
	
	@Test(priority = 1)
	public void tc4 () {

		System.out.println("tc 4..");

	}
	@Test(priority = -2)
	public void tc5() {

		System.out.println("tc 5..");

	}
	@Test(priority = 0)
	public void tc2() {

		System.out.println("tc 2..");

	}
	@Test(priority = -1)
	public void tc3() {

		System.out.println("tc 3..");

	}
	@Test(priority = 2)
	public void tc1() {

		System.out.println("tc 1..");

	}

}
