package basicscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.qaloginclick;
import resources.base;

public class Validation extends base{ //inheriting from other class using "extends"
	
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
		
		Assert.assertEquals(qaclick.gettitle().getText(), "FEATURED COURSES");
		
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	


}
