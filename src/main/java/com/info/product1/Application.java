package com.info.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	static Logger logger = LoggerFactory.getLogger(Application.class);
public static void main(String[] args) {
	
	logger.trace("Stable");
	logger.debug("debug");
	logger.info("info");
	logger.info("This is it");
	logger.error("error");
	logger.warn("warning");

}
}
