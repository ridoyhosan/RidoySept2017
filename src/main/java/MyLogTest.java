import org.apache.log4j.Logger;

public class MyLogTest {
	//Get the Logger object.
		private static Logger log = Logger.getLogger(MyLogTest.class);
	 
		public static void main(String[] args) {	
			//logger messages
			log.debug("Log4j debug message test.");
			log.info("Log4j info message test.");
			log.warn("Log4j warn message test.");
			log.error("Log4j error message test.");
			log.fatal("Log4j fatal message test.");
		}
		
		
		
}
