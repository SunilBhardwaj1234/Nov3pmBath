package NewwebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAbsoultePath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shivaji/OneDrive/Desktop/sellllxpath.html");
driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("hi");//A
driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("hi");//b

driver.findElement(By.xpath("./html/body/div[2]/input[2]")).sendKeys("sunil");//d

//we can directly write absolute xpath
driver.findElement(By.xpath("./html/body/div[1]/input[1]|html/body/div[2]")

	}

}
''