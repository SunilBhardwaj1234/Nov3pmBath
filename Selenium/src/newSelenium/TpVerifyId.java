package newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TpVerifyId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/");
		String windowIdForGoogle = driver.getWindowHandle();
System.out.println(windowIdForGoogle);

driver.navigate().to("https:/www.facbook.com/");
String windowIdForFacebook = driver.getWindowHandle();
System.out.println(windowIdForFacebook);
}

}
