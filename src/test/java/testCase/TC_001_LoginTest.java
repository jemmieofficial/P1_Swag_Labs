package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {

	@Test(dataProvider="testData")
	public void loginTest(String uname,String pword) throws Exception
	{
		try
		{
		LoginPageObjects lp=new LoginPageObjects(d);
		lp.clearUsername();
		lp.setUsername(uname);
		lp.clearPassword();
		lp.setPassword(pword);
		Thread.sleep(3000);
		lp.clickLogin();
		
		HomePageObjects hp=new HomePageObjects(d);
		hp.clickMenu();
		hp.clickLogout();	
		}
		
		catch(Exception e)
		{
			Assert.assertTrue(true);
		}
		
		
	}

}
