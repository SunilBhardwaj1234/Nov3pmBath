import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzonedrop {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirt");
	Thread.sleep(3000);
	driver.switchTo();
	driver.findElement(By.xpath(("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]"))).click();
	
	

}
}
