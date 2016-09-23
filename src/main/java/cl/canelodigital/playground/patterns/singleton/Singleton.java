package cl.canelodigital.playground.patterns.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cl.canelodigital.playground.dto.SampleDTO;

public class Singleton {

		   private static Singleton instance = null;
		   private static final Logger log = LogManager.getLogger(SampleDTO.class);
		   
		   protected Singleton() {
		      // Exists only to defeat instantiation.
		   }
		   public static Singleton getInstance() {
			   log.debug("entering getInstance");
		      if(instance == null) {
		         instance = new Singleton();
		      }
		      
		      log.debug("exiting getInstance");
		      return instance;
		   }
}
