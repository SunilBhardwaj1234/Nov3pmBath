package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfElements {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
		Dimension userdim = driver.findElement(By.id("123")).getSize();
		int userHeight = userdim.getHeight();
		int userwidth = userdim.getWidth();
		
		Dimension passwd = driver.findElement(By.id("1244")).getSize();
		
		int paswdHeight = passwd.getHeight();
		int paswdWidth = passwd.getWidth();
		if(userHeight==userwidth &&userwidth==paswdWidth)
		{
			System.out.print("pass");
			
			
		}
		else {
			System.out.print("fail");
			
			driver.quit();
		}

}
}