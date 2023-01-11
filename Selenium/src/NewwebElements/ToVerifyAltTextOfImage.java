package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {
	public static void main(String[] args) {
		String expectedTitle="Flipkart";
		String expectedToolTipText="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		String actualTitle = driver.findElement(By.xpath("//img[@src='//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png']")).getAttribute("title");

	System.out.print(actualTitle);
	if(actualTitle.contains(expectedTitle))
	{
		System.out.print("pass");
		
	}
	System.out.print("fail");
	}
	
	
}