package cl.canelodigital.playground.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneralHelper {

	private static final GeneralHelper instance = new GeneralHelper();
	private static final Logger log = LogManager.getRootLogger();

	/**
	* Constructor
	**/
	protected GeneralHelper() {
		if (log.isDebugEnabled()) {
			log.debug("Entering constructor GeneralHelper");
		}

		try {

		} catch (Exception e) {

		}

		if (log.isDebugEnabled()) {
			log.debug("Leaving constructor GeneralHelper");
		}
	}

	public static GeneralHelper getInstance() {
	      return instance;
	}
	   
	   public void printSomething(){
		   System.out.println("something!");	   
	   }
	   
	    @Override
	    public String toString() {
	        return String.format("");
	    }
}

