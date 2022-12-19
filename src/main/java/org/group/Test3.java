package org.group;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups ="smoke")
	public void tc1000() {

		System.out.println("tc 1000..");

	}
	@Test(groups ="sanity")
	public void tc2000() {

		System.out.println("tc 2000..");

	}
	@Test(groups="Regression")
	public void tc3000() {

		System.out.println("tc 3000..");

	}

}
