package cl.canelodigital.playground;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSampleClassMain {

	private SampleClassMain testObject=new SampleClassMain();
	private static final Logger log = LogManager.getLogger(SampleClassMain.class);
	
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
		SampleClassMain testObject1=new SampleClassMain();
		SampleClassMain testObject2=new SampleClassMain();
		
		testObject2.sb.append("1");
		log.debug(testObject1.testMethod1());
		log.debug(testObject2.testMethod1());
		assertNotEquals(testObject1.testMethod1(),testObject2.testMethod1());
	}
	
	

}
