package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount =5)
	public void demo() {
		System.out.println("test");
		
	}

}
//InvocationCount is help to run the same test script with same value as many time as count given