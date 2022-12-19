package org.group;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups ="smoke",priority =2)
	public void tc1() {

		System.out.println("tc 1..");

	}
	@Test(groups="sanity")
	public void tc2() {

		System.out.println("tc 2..");

	}
	@Test(groups="Regression")			
	public void tc3() {

		System.out.println("tc 3..");

	}

}
