package com.testing.framework.testng.hardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.framework.testng.base.BaseClass;

public class Runner extends BaseClass{
	
	@Test
	public void test() {
		String expected = "Yahooo";
		String actual = "Google";
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertTrue(expected.equals(actual), "Results doesn't match");
		//Assert.fail("Failing test intentionally");
	}

}
