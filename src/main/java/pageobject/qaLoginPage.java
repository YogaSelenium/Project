package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaLoginPage {
	
	public WebDriver driver;
	
	
	By email=By.id("user_email");
	By password=By.id("user_password");
	By loginbutton=By.xpath("//input[@type='submit']");
	
	
	public qaLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmial()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(loginbutton);
	}
	
}