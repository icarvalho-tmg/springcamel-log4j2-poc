package com.ericsson.smart.poc;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExampleProcessor implements Processor {
	
	private static Logger logger = LogManager.getLogger();
	@Override
	public void process(Exchange exchange) throws Exception {
		String a = "String A";
		String b = "String B";
		Message in = exchange.getIn();
		in.setBody("Testing log4j2 inside a Camel Processor!");
		logger.info("a={},b={}", a, b);		
	}

}
