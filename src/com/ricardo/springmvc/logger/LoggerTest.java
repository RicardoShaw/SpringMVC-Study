package com.ricardo.springmvc.logger;

import org.apache.log4j.Logger;

public class LoggerTest {
	private static Logger logger = Logger.getLogger(LoggerTest.class);
	
	
	public void Tick(){
		System.out.println("Tick Tack");
		logger.debug("debug Pattern");
		logger.info("info Pattern");
		logger.error("error Pattern");
	}
	
	
	public static void main(String [] args){
		LoggerTest test = new LoggerTest();
		test.Tick();
	}
}
