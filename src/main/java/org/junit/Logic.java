package org.junit;

public class Logic {
	@Test
	public void test() {
		Assert.assertTrue("Verify test method in logic", true);
		System.out.println("test");

	}
	@Test
	public void test1() {
		Assert.assertTrue("Verify test method in logic", false);
		System.out.println("test1");

	}
	@Test
	public void test2() {
		Assert.assertEquals("Verify test method in logic", "Nisha", "nisha");
		System.out.println("test2");

	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Verify test method in logic", "Nisha", "Nisha");
		System.out.println("test4");

	}
	@Test
	public void test4() {
		Assert.assertEquals("Verify test method in logic", 100,100);
		System.out.println("test3");

	}

}
