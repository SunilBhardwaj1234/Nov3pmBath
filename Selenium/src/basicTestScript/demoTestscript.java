package basicTestScript;

import org.testng.annotations.Test;

import genricUtility.baseClass;

public class demoTestscript extends baseClass {

	
	@Test(priority=1)
	public void verifyLogin()
	{
		System.out.println("login page has been varified ");
	}
		
		@Test(priority = 2)
		public void verifyCreateUser()
		{
			System.out.println("user has been created");
	
}
}