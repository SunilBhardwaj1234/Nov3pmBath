package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {
	public static void main(String[] args) {
		String expectedToolTipText="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualToolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		System.out.print(actualToolTipText);
		if(actualToolTipText.equals(actualToolTipText))
		{
			
			System.out.print("verified");
		}
		else {
			System.out.print("not verified");

		

		}
		
}
}