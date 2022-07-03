package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("Hello there!");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}

}
