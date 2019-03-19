package com.testing.framework.testng.skipTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.testing.framework.testng.base.BaseClass;

public class Runner extends BaseClass{
	
	@Test
	public void testSkip() {
		if(true) {
			throw new SkipException("skipping intentionally");
		}
	}

}
