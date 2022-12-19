package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void test() {
		Assert.assertTrue(true, "verify test");
	}
	@Test
	public void test1() {
		Assert.assertTrue(false, "verify test1");
	}
	@Test
	public void test2() {
		Assert.assertTrue(true, "verify test2");
	}
	@Test
	public void test3() {
		Assert.assertTrue(false, "verify test3");
	}

}
