package cl.canelodigital.playground;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	  TestSampleClassMain.class,
	  TestSingleton.class
	})

	public class TestAll {
	  // the class remains empty,
	  // used only as a holder for the above annotations
	}

