package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver d;

@BeforeClass
@Parameters({"browser"})
public void setup(String browser)
{
	if(browser.equals("chrome"))
	{
		d=new ChromeDriver();	
	}
	else if(browser.equals("edge"))
	{
		d=new EdgeDriver();
	}
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	d.manage().window().maximize();
	d.get("https://www.saucedemo.com/inventory.html");
	
}

@AfterClass
public void teardown()
{
	d.quit();

}

@DataProvider(name="testData")
public String[][] loginData()
{
String[][] data=new String[3][2];
data[0][0]="abcdef";
data[0][1]="ghijkl";
data[1][0]="standard_user";
data[1][1]="secret_sauce";
data[2][0]="poiuyt";
data[2][1]="abcdef";
return data;

}

	
}
