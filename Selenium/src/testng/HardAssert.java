package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void demo()
{
boolean expectedData=true;
boolean actualData=false;
Assert.assertEquals(actualData,expectedData);
System.out.print("pass");


}

}
