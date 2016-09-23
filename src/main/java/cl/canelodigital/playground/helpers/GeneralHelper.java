package cl.canelodigital.playground.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneralHelper {

	private static GeneralHelper instance = null;
	private static final Logger log = LogManager.getLogger(GeneralHelper.class);

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
		   log.debug("entering getInstance");
		      if(instance == null) {
		         instance = new GeneralHelper();
		      }
		      
		      log.debug("exiting getInstance");
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

