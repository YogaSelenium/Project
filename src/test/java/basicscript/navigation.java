package basicscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.qaloginclick;
import resources.base;

public class navigation extends base{                //inheriting from other class using "extends"
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basepagenavigate() throws IOException
	{
		
		
		qaloginclick qaclick=new qaloginclick(driver);   //creating object to that class and invoke methods of it
		
		Assert.assertTrue(qaclick.NavBar().isDisplayed());
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	


}
