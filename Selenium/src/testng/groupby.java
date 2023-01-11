package testng;

import org.testng.annotations.Test;

public class groupby {
	
		@Test(groups ="smoke")
		public void login() {
			System.out.println("logged in succesful");
			
			
		}
		@Test(groups = "regression")
		public void search() {
			System.out.println("product found");
			

	}
		@Test(groups = "regression")
		public void select()
		{
			System.out.println("product selected");
			
	}
		
		@Test(groups ="smoke")
		public void addtocart() {
			System.out.println("product succesfully added on cart");
			
	}
		
		@Test(groups = "regression")
		public void payment() {
			System.out.println("payemnt succeful");
			
	}
		@Test(groups ="smoke")
		public void logout() {
			System.out.println("logged out succesfully");
	}
	}

