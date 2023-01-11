package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPtahByAxes {
	 
	//String productname ="APPLE iPhone 11 (Black, 64 GB)";
	//;String pprice="39,999"
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
	driver.get("https://www.flipkart.com/search?q=iphone%2011&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
 
driver.findElement(By.xpath("//div[text()='String productname ="APPLE iPhone 11 (Black, 64 GB)']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()]");
		
	}}