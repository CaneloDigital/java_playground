package cl.canelodigital.playground;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cl.canelodigital.playground.helpers.GeneralHelper;

public class TestGeneralHelper {

	private static final Logger logger = LogManager.getRootLogger();

	/**
	* Constructor
	**/
	public TestGeneralHelper() {
		if (logger.isDebugEnabled()) {
			logger.debug("Entering constructor TestGeneralHelper");
		}

		try {

		} catch (Exception e) {

		}

		if (logger.isDebugEnabled()) {
			logger.debug("Leaving constructor TestGeneralHelper");
		}
	}

	@Test
	public void testUnique() {
		      logger.info("checking singletons for equality");
		      GeneralHelper sone = GeneralHelper.getInstance();
		      GeneralHelper stwo = GeneralHelper.getInstance();
		      assertEquals(true, sone == stwo);
	}
}
