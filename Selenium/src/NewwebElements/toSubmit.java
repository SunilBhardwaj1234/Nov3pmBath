package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toSubmit {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			Thread.sleep(5000);
	driver.findElement(By.id("u_2_s_xn")).submit();

	}

}
