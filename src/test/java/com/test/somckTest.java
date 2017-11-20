package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

public class somckTest {
	//static Logger log = Logger.getLogger(log4jExample.class.getName());
	@Test
	public void m1()
	{
		DOMConfigurator.configure("log4j.xml");
	    Logger log = Logger.getLogger(somckTest.class);
	    log.debug("Log4j debug message test.");
        log.info("Log4j info message test.");
	    log.warn("Log4j warn message test.");
	    log.error("Log4j error message test.");
	    log.fatal("Log4j fatal message test.");
	}
	
	
	
	
	

}
