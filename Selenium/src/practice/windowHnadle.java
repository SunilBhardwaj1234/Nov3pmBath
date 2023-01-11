package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHnadle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//String parent=driver.getWindowHandle();
		//System.out.println(parent);
		
		//Thread.sleep(10000);
		driver.get("https://www.youtube.com");
	Set<String>childid=driver.getWindowHandles();
	//System.out.println(childid);
	for (String id : childid)
	{
		System.out.println(id);
	}
		

	}

}
