package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElements2 {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
	Point userPos = driver.findElement(By.id("123")).getLocation();
	Point paswdPos = driver.findElement(By.id("1244")).getLocation();
	int usernameStartY = userPos.getX();
	int UserpaswdStsrtY = paswdPos.getX();
	

}
}