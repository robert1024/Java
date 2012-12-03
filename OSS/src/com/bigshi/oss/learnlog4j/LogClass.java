package com.bigshi.oss.learnlog4j;

import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogClass {

	private static Logger log = Logger.getLogger(LogClass.class);
	
	public static void main(String[] args) {
		log.setLevel(Level.WARN);
		
		log.info(new Date().toString());
		log.trace("Trace message!");
		log.debug("Debug message!");
		log.info("Info message!");
		log.warn("Warn message!");
		log.error("Error message!");
		log.fatal("Fatal message!");
	}

}
