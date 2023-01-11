package JavaScriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClick {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	driver.findElement(By.xpath("//a[text()='jdk-8u351-linux-aarch64.rpm']")).click();
WebElement link=driver.findElement(By.xpath("//a[text()='Download jdk-8u351-linux-aarch64.rpm']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()",link);
	
}
}