package newSelenium;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chrome.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
Point pos = new Point(100,100);

		
	}
}