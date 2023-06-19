package testCase;

import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {

	@Test(dataProvider="testData")
	public void loginTest(String uname,String pword) throws Exception
	{
		logger.info(" ***** Test started for TC_001_LoginTest *****");
		try
		{
		LoginPageObjects lp=new LoginPageObjects(d);
		HomePageObjects hp=new HomePageObjects(d);
		lp.clearUsername();
		logger.info("Username cleared");
		lp.setUsername(uname);
		logger.info("Username passed");
		lp.clearPassword();
		logger.info("password cleared");
		lp.setPassword(pword);
		logger.info("password passed");
		Thread.sleep(3000);
		lp.clickLogin();
		logger.info("login button is clicked");
		
		if(hp.logoCheck()==true)
		{
			logger.info("login is successful");
		}
		else
		{
			logger.info("login is unsuccessful");
		}
		
		hp.clickMenu();
		logger.info("menu button is clicked");
		hp.clickLogout();	
		logger.info("logout button is clicked");
		
		if(lp.logoCheck()==true)
		{
			logger.info("logout is successful");
		}
		
		System.out.println("Positive test scenario passed");
		}
		
		catch(Exception e)
		{
			System.out.println("Negative test scenario passed");
		}
		
		
	}

}
