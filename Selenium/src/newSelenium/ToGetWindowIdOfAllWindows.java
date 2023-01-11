package newSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIdOfAllWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//String childId = driver.getWindowHandle();
	
		Set<String> allids = driver.getWindowHandles();
		//System.out.print(allids);
		//for(String id:allids);
		//System.out.print
	
		for(String id:allids)
		{
			if(id.equals(parentId))
			{
			driver.switchTo().window(id);
			
				String child = driver.getTitle();
				System.out.print(child);
				
			}
			else
			{
			parentId=driver.getTitle();
			System.out.print(parentId);
			}
			}
		
		
		

	}

}