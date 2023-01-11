package sycronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F%3Cuser-name%3E%2F%3Crepo-name%3E&source=header-repo&source_repo=typicode%2Fjson-server");
	driver.findElement(By.id("email")).sendKeys("sunildbhardwaj@gmail.com");
	WebElement continuebutton=driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]"));

	wait.until
	
	
	
	
		// TODO Auto-generated method stub
	}

}
