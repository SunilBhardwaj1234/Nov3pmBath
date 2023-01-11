package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollVertically {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev");
	// WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,-200)");
	 
	 driver.navigate().to("https://www.kwokyinmak.com/");
	
		// TODO Auto-generated method stub

	}

}
