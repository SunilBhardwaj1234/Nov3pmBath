package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedorNot {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
	 boolean displayed = driver.findElement(By.id("email")).isDisplayed();
	 if(displayed)
			 {
			System.out.print("pass");	 
			 }
	 else {
		 
		 System.out.print("fail")	;
	 }
			 }
	

}
