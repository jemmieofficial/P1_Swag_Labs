package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends BasePageObjects {

	public HomePageObjects(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//button[@id='react-burger-menu-btn']")	
WebElement btn_menu;

@FindBy(xpath="//a[@id='logout_sidebar_link']")	
WebElement btn_logout;

public void clickMenu()
{
	btn_menu.click();
}

public void clickLogout()
{
	btn_logout.click();
}


}
