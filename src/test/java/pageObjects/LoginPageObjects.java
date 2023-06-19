package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects extends BasePageObjects{

	public LoginPageObjects(WebDriver d) {
		super(d);
	}

@FindBy(xpath="//input[@id='user-name']")	
WebElement txt_username;

@FindBy(xpath="//input[@id='password']")	
WebElement txt_password;

@FindBy(xpath="//input[@id='login-button']")	
WebElement btn_login;

@FindBy(xpath="//div[@class='login_logo']")
WebElement lp_logo;

public void setUsername(String uname)
{
	txt_username.sendKeys(uname);
}

public void setPassword(String pword)
{
	txt_password.sendKeys(pword);
}

public void clearUsername()
{
	txt_username.clear();
}

public void clearPassword()
{
	txt_password.clear();
}

public void clickLogin()
{
	btn_login.click();
}

public boolean logoCheck()
{
	return lp_logo.isDisplayed();
}

}
