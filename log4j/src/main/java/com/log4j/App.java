package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {
	static Logger log = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		PropertyConfigurator.configure("/home/loel/git/HCL/HCL/log4j/src/main/resources/log4j.properties");
		log.info("Information is here");
		log.debug("Debugging Message");
		log.warn("Live without Warning");
		log.error("Error in the matrix");
		log.fatal("Fatallity");

	}

}
