package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGertWEindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
WebDriver driver=new ChromeDriver();
String id = driver.getWindowHandle();
System.out.print(id);
WebDriver driver1=new ChromeDriver();
String id2 = driver1.getWindowHandle();
System.out.print(id2);


	}

}
