package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToscrollBoth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
	// WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
	driver.manage().window().setSize(new Dimension(200,500));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(100,500)");
	
	js.executeScript("history.go(0)");//to refresh
	
	//To get title
	
	String title=js.executeScript("return document.title").toString();//to print title
			System.out.println(title);

	}

}
