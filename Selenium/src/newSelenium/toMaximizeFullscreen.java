package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toMaximizeFullscreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.manage().window().fullscreen();
Thread.sleep(2000);
//driver.manage().window().minimize();//only for selenium 4


	}

}
