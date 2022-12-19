package org.testng;

import org.testng.annotations.Test;

public class HardAssert {
@Test	
	public void tc1() {
		System.out.println("Tc 1");
	
	}
@Test
	public void tc2() {
		//Assertion-fail
		//Hard Assert
		System.out.println("Tc 2");
		System.out.println(1);
		Assert.assertTrue(true);
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
