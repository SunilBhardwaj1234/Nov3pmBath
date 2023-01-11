package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.manage().window().fullscreen();
	Navigation nav = driver.navigate();
	nav.to("https://youtube.com/");
	nav.back();

	
	}

}

