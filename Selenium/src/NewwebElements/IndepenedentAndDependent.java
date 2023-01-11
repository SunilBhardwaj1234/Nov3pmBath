package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndepenedentAndDependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone11&ref=nb_sb_noss");
		String text = driver.findElement(By.xpath("//span[contains(text(), 'Apple iPhone 13 (64GB) - (Pr')]/../../../../..//span[text()='49,900']")).getText();
		System.out.print(text);
}
}