package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVarifyErrorMessage {
	public static void main(String [] args) throws InterruptedException
	 {
		String ecpectederrormsg="Username or Password is invalid";
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do;");
		// 
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 Thread.sleep(5000);
		 
		//actualErrorMessage = driver.findElement(By.className("errormsg"));
	 String actualErrorMessage = driver.findElement(By.className("errormsg")).getText();
	 if (actualErrorMessage.contains(ecpectederrormsg)){
		 
		 System.out.print("pass");
	 }
	 else
	 {
		 System.out.print("fail");
		 
	 }
	 
}
}