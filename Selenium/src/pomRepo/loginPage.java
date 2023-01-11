package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement usernameTextFiled;


@FindBy(name="pwd")
private WebElement PasswordTextField;
		
@FindBy(xpath="//div[text()='Login ']")
private WebElement LoginButton;

public WebElement getUsernameTextFiled() {
	return usernameTextFiled;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}

public void loginAction(String username, String password)
{
usernameTextFiled.sendKeys(username);
PasswordTextField.sendKeys(password);
LoginButton.click();
}



	}


