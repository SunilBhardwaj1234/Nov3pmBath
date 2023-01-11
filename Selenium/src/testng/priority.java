package testng;

import org.testng.annotations.Test;

public class priority {
	@Test(priority = 2)
	public void Aemo3()
	{
		System.out.println("Demo 1 test");
		
	}
	@Test(priority =3)
	public void bemo3()
	{
		System.out.println("Demo 2 test");
		
		
	}

	@Test(priority = 1)
	public void aemo1()
	{
		System.out.println("Demo 3 test");
		
	}
	@Test
	public void qemo3()
	{
		System.out.println("Demo q test");
		
	}
}

