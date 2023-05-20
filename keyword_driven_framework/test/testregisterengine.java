package keyword_driven_framework.test;

import org.testng.annotations.Test;

import keyword_driven_framework.engine.registerengine;

public class testregisterengine {
	
	
	@Test
	public static void verifyingregister() throws Exception {
		
		//creating object of registerengine file and executing
		registerengine regengine = new registerengine();
		regengine.execute();
	}
	
	
}
