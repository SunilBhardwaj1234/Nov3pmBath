package genricUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pomRepo.loginPage;

public class baseClass {

	@BeforeSuite
	public void bcConfig()
	{
		System.out.println("data base conncetion has been established");
		
		
	}
	@BeforeClass
	public void bbConfig() throws IOException
	{
		FileUtility futil=new FileUtility();
		String url=futil.fetchDataFromPropertyFile("url");
		
	   	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       	   WebDriver driver =new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.get(url);
   	
		System.out.println("browser has been launched ");
		System.out.println("navigate to the url");
		
		
}
	@BeforeMethod
	public void btrConfig()
	{

   		loginPage login=new loginPage(driver);
   		login.loginAction(username, password);
       
		System.out.println("loggin to the application");
	
	}
	
	@AfterMethod
	public void btConfig()
	{
		System.out.println("logoyt to hr application ");
	}
	@AfterSuite			
	public void urConfig()
	{
		System.out.println("logoyt to hr application ");
}
	@AfterClass
	public void abfConfig()
	{
		System.out.println("browser has been launched ");
	
}}




