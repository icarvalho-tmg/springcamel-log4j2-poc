package com.ericsson.smart.poc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class FooTest {

	private static Logger logger = LogManager.getLogger();
	@Test
	public void bar() {

		String a = "String A";
		String b = "String B";
		logger.debug("a={},b={}", a, b);

	}

}
