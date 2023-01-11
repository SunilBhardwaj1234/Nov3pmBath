package testng;
import org.testng.annotations.DataProvider;
//IF YOU WANT TO RUN SAME TEST CASE
import org.testng.annotations.Test;


public class dataprovider {
	
	
	@Test(dataProvider ="data")
	public void test(String state, String capital)
	{
		System.out.println(state+"  "+capital);
		
		
		
	}
    @DataProvider
public Object[][] data()
{
Object[][]ar=new Object[3][2];
ar[0][0]="DELHI";
ar[1][0]="UP";
ar[2][0]="KARNATAKA";

ar[0][1]="new delhi";
ar[1][1]="lucknow";
ar[2][1]="banglore";

return ar;
}



}