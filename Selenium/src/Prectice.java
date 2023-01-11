import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prectice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium101\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("admin");
		Thread.sleep(2000);
		a.clear();
		Thread.sleep(3000);
		a.sendKeys("aman");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	
	}
}
