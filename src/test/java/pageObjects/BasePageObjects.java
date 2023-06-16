package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObjects {

	public WebDriver d;
	public BasePageObjects(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
}
