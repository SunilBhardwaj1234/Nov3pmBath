package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOGetSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
		
		Rectangle username = driver.findElement(By.id("123")).getRect();//rectangle(interface has four method):getheight().gety();getWidth(),get(y)

	Rectangle paswd = driver.findElement(By.id("1244")).getRect();
	int usernmaneStarty = username.getY();
	int usernameHeight = username.getHeight();
	int userEndPOINT = usernmaneStarty+usernameHeight;
	int PASSWORDStarty = paswd.getY();
	
	
	int space = PASSWORDStarty-userEndPOINT;
	System.out.println("space is"+space);
	}

}
