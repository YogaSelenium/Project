package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException   //here void got changes to webdriver bcz we have given return
	{
		 prop=new Properties();
		FileInputStream fistream=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\datas.properties");
		prop.load(fistream);
		String browse=prop.getProperty("browser");
		
		if(browse.equals("chrome"))   //here we should not use == instead of that we ll be using .equals
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exedrivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			return driver;
		}
		else if(browse.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\exedrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			return driver;
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
