package com.test.hello;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	private static org.slf4j.Logger logger1 = LoggerFactory.getLogger(App.class);

	private static org.apache.log4j.Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		logger.debug("log4j log");
		logger1.debug("slf4j log");
		System.out.println("Hello World!");
	}
}
