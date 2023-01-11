package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Navigation nav = driver.navigate();
		nav.to("https://www.facebook.com/");
		nav.refresh();
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(1000);
		nav.forward();
		Thread.sleep(1000);

	}
}
