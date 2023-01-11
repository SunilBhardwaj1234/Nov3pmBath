package testng;




import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethod {
	
	@Test(priority=1)
	public void login() {
		System.out.println("logged in succesful");
		
		
	}
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("product found");
		

}
	@Test(dependsOnMethods="search")
	public void select()
	{
		System.out.println("product has been selected");
	
		Assert.fail();
}
	
	@Test(dependsOnMethods="select") 
	public void addtocart() {
		Assert.fail();
		System.out.println("product succesfully added on cart");
	
}
	
	@Test(dependsOnMethods="addtocart")
	public void payment() {
		System.out.println("payemnt succeful");
		
}
	@Test
	public void logout() {
		System.out.println("logged out succesfully");
}
}