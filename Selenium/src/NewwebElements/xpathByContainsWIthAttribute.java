package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContainsWIthAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
		driver.findElement(By.xpath("//input[contains(@name, 'bhardwaj')]")).sendKeys("hii");

//x path by contain function using attributes 

		
		
	}

}



