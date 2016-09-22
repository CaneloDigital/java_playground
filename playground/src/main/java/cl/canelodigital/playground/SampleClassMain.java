package cl.canelodigital.playground;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleClassMain {
	
	private static final Logger log = LogManager.getLogger(SampleClassMain.class);
	
	public static StringBuffer sbStatic=new StringBuffer("");
	public StringBuffer sb=new StringBuffer("");
	
	public static void main(String[] args){
		log.debug("Entering SampleClassMain.main");
		
		sbStatic.append("Felicitaciones ");
		sbStatic.append("Xino");
		sbStatic.append("!!!");
		System.out.println(sbStatic.toString());
		
		log.debug("Finished SampleClassMain.main");
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
