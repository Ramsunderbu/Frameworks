package org.group;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups ="smoke")
	public void tc100() {

		System.out.println("tc 100..");

	}
	@Test(groups="sanity",priority =2)
	public void tc200() {

		System.out.println("tc 200..");

	}
	@Test(groups="Regression")
	public void tc300() {

		System.out.println("tc 300..");

	}

}
