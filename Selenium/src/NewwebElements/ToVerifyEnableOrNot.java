package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnableOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(8000);
		driver.findElement(By.id("email")).sendKeys("sunildbhardwaj@gmail.com");
		Thread.sleep(3000);
		boolean enbaled = driver.findElement(By.xpath("(//button[contains(text(), 'Continue')])[1]")).isEnabled();
		if(enbaled)
		{
		System.out.print("pass");
		
		}
		else 
	
		System.out.print("Fail");
		}
		
}

	