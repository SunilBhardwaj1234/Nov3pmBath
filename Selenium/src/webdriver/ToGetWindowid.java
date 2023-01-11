package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> childId = driver.getWindowHandles();
		System.out.println(childId);
		
		driver.switchTo();
		
	}

}
