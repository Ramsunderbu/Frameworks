package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void tc1() {
		System.out.println("Tc 1");

	}

	@Test
	public void tc2() {
		SoftAssert s = new SoftAssert();

		System.out.println("Tc 2");
		System.out.println(1);

		s.assertTrue(false);
		System.out.println(2);
		System.out.println(3);
		Assert.assertEquals("hello", "hai");
		System.out.println(4);

	}

	@Test
	public void tc3() {
		System.out.println("Tc 3");

	}

}
