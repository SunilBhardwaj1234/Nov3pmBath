package newSelenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
int startx = pos.getX();
int starty = pos.getY();
System.out.println(startx);
System.out.println(starty);


	}

}
