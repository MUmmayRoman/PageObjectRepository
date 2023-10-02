package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	
	private final WebDriver driver;
	public WebElement link_LogOut;
	
	public LogOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void signOut()
	{
		link_LogOut = driver.findElement(By.linkText("Log out"));
	}

}
