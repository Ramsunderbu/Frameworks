package org.testng;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority =1)
	public void tc100() {

		System.out.println("tc 100..");

	}
	@Test(priority =2)
	public void tc200() {

		System.out.println("tc 200..");

	}
	@Test(priority =3)
	public void tc300() {

		System.out.println("tc 300..");

	}

}
