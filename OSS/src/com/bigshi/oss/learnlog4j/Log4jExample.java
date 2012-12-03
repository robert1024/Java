package com.bigshi.oss.learnlog4j;

import org.apache.log4j.Logger;

public class Log4jExample {

	static Logger log = Logger.getLogger(Log4jExample.class.getName());
	
	public static void main(String[] args) {
		log.debug("Hello, this is an debug message");
		log.info("Hello, this is an info message");
	}
}
