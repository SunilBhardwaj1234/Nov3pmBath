package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesttions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(2000);
 List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[text()='selenium']"));
 int a = autosuggestion.size();
System.out.println(a);








 
		
		
	}

}
