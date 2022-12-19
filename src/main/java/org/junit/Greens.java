package org.junit;

public class Greens {
	@Test
	public void test() {
		Assert.assertTrue("Verify test method in Greens", true);
		System.out.println("test in Greens");

	}
	@Test
	public void test1() {
		Assert.assertTrue("Verify test method in Greens", false);
		System.out.println("test1 in Greens");

	}
	@Test
	public void test2() {
		Assert.assertEquals("Verify test method in Greens", "Nisha", "nisha");
		System.out.println("test2 in Greens");

	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Verify test method in Greens", "Nisha", "Nisha");
		System.out.println("test4 in Greens");

	}
	@Test
	public void test4() {
		Assert.assertEquals("Verify test method in Greens", 100,100);
		System.out.println("test3 in Greens");

	}

}
