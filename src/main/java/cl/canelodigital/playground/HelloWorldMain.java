package cl.canelodigital.playground;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cl.canelodigital.playground.helpers.GeneralHelper;

public class HelloWorldMain {
	
	private static final Logger log = LogManager.getLogger(HelloWorldMain.class);
	
	public static StringBuffer sbStatic=new StringBuffer("");
	public StringBuffer sb=new StringBuffer("");
	
	public static void main(String[] args){
		log.debug("Entering SampleClassMain.main");
		
		sbStatic.append("Felicitaciones ");
		sbStatic.append("Xino");
		sbStatic.append("!!!");
		System.out.println(sbStatic.toString());
		
		testSingleton();
		
		log.debug("Finished SampleClassMain.main");
	}
	
	private static void testSingleton(){
		GeneralHelper helper=GeneralHelper.getInstance();
		helper.printSomething();
	}
	
	public String testMethodsbStatic(){
		return sbStatic.toString();
	}
	
	public String testMethod1(){
		return this.sb.toString();
	}
	
	public String testMethod2(){
		return this.sb.toString();
	}
}
