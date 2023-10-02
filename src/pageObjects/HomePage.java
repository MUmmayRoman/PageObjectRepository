package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private final WebDriver driver;
	public WebElement button_Login;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void clickLogin()
	{
		
		button_Login = driver.findElement(By.name("btnLogin"));
	}
	

}
