package com.testing.framework.testng.factory;

import org.testng.annotations.Factory;

public class Runner {

	@Factory
	public Object[] runInstances() {
		return new Object[] { new LoginTests(), new LoginTests() };
	}

}
