package cl.canelodigital.playground;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.canelodigital.playground.helpers.GeneralHelper;

public class TestHelloWorldMain {

	private HelloWorldMain testObject=new HelloWorldMain();
	private static final Logger log = LogManager.getLogger(HelloWorldMain.class);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testsbStatic() {
		assertEquals(testObject.testMethodsbStatic(),testObject.testMethodsbStatic());
	}
	
	@Test
	public void test2() {
		HelloWorldMain testObject1=new HelloWorldMain();
		HelloWorldMain testObject2=new HelloWorldMain();
		
		testObject2.sb.append("1");
		log.debug(testObject1.testMethod1());
		log.debug(testObject2.testMethod1());
		assertNotEquals(testObject1.testMethod1(),testObject2.testMethod1());
	}
	
	public void testUnique() {
	      log.info("checking singletons for equality");
	      GeneralHelper sone = GeneralHelper.getInstance();
	      GeneralHelper stwo = GeneralHelper.getInstance();
	      assertEquals(true, sone == stwo);
	}
	

}
