package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
	    System.out.println(parent);
	
	   // WebDriver driver1 = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	}
}
