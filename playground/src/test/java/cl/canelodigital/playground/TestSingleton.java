package cl.canelodigital.playground;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cl.canelodigital.playground.patterns.singleton.Singleton;

public class TestSingleton {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testEquality() {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		assertEquals(a,b);
	}

}
