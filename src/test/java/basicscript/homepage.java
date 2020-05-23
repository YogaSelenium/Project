package basicscript;


import java.io.IOException;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.qaLoginPage;
import pageobject.qaloginclick;
import resources.base;



public class homepage extends base{ //inheriting from other class using "extends"
	public WebDriver driver;
	
	
	//public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basepagenavigate(String Username,String Passwrd) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		
		qaloginclick qaclick=new qaloginclick(driver);   //creating object to that class and invoke methods of it
		qaclick.getLogin().click();
		
		qaLoginPage lp=new qaLoginPage(driver);
		lp.getEmial().sendKeys(Username);
		lp.getPassword().sendKeys(Passwrd);
	   
		lp.getSubmit().click();
		
		
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] datas=new Object[2][2];
		//0th row
		datas[0][0]="pcyoga";
		datas[0][1]="125524";
		
		
		
		datas[1][0]="yogapc";
		datas[1][1]="32566";
		
		return datas;
		
	}

}
