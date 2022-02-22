package org.testng;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority = -6)
	private void testClass1() {
		System.out.println("Test 1");
	}

	@Test(priority = 5)
	private void testClass2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = 1)
	private void testClass3() {
		Assert.assertTrue(false);
		System.out.println("Test 3");
	}
	
	@Test(enabled = false)
	private void testClass4() {
		System.out.println("Test 4");
	}
	
	@Test(invocationCount = 5)
	private void testClass5() {
		System.out.println("Test 5");
	}
}
 