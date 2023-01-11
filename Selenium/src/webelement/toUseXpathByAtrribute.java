package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class toUseXpathByAtrribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		// Navigation nav=driver.navigate();
		 //nav.back();
		//driver.findElement(By.xpath("//a[contains(text() , 'F')]")).click();
		
		driver.findElement(By.xpath(""))
		
		
	}

}
