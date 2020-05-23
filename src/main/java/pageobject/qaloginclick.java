package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaloginclick {
	
	public WebDriver driver;
	
	By loginclick=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavigationBar=By.xpath("//nav[@class='navbar-collapse collapse']");
    
	
	public qaloginclick(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(loginclick);
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement NavBar()
	{
		return driver.findElement(NavigationBar);
	}
}
