package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 20')]")).getText();//xpath by conatin funtion using partial text
		
System.out.print(text);

}
}