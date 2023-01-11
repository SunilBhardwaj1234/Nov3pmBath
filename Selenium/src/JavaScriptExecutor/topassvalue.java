package JavaScriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class topassvalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://demoapp.skillrary.com/");
WebElement disabled = driver.findElement(By.xpath("//input[@class='form-control']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments(0).value='sunil'", disabled);

}
	
}














/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://demoapp.skillrary.com/");
WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argument[0].value='sunil'", disableElement);*/

