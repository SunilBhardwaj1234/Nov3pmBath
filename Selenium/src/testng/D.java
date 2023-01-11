package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D {

		@Test
		void chrome()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			new ChromeDriver();
}
}