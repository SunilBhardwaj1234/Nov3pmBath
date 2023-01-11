package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVERifyAlighment {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
	Point userPos = driver.findElement(By.id("123")).getLocation();
	Point paswdPos = driver.findElement(By.id("1244")).getLocation();
	
	int usernameStartX = userPos.getX();
	int UserpaswdStsrtX = paswdPos.getX();
	
	if(usernameStartX==UserpaswdStsrtX)
	{
		System.out.print("pass");
		
	}
	else
			System.out.print("fail");
		
}
}