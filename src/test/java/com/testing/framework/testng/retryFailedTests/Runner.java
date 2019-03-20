package com.testing.framework.testng.retryFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner {
	
	@Test
	public void test1() {
		Assert.fail();
	}

}
