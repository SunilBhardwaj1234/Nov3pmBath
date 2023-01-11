package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;//declare the webdriver as global
	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;//initilaze the  driver
		
	}

	@FindBy(id="logoutLink")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

public String VerifyTitle()
{
	return driver.getTitle();
}
public void logoutAction()
{
	logoutButton.click();	
}
	}


