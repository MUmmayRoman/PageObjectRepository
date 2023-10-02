package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	private final WebDriver driver;
	public WebElement text_UserName;
	public WebElement text_Password;
	
	public LogInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginCredential()
	{
		 text_UserName = driver.findElement(By.name("uid"));
		 
		 text_Password = driver.findElement(By.name("password"));

	}
	

}
