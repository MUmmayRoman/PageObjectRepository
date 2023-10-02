package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.LogOutPage;


public class PageObjectModel {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		//Launch a new chrome browser.
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Roman's_WorkPlace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
										
		//Adding Implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		String url = "https://demo.guru99.com/V4/index.php";
		driver.get(url);
						
	}
	
	@AfterClass
	public void tear()
	{
		//Close the Browser.
	      driver.close();
	}
	
	@Test
	public void login() throws InterruptedException
	{
		
		LogInPage loginpage = new LogInPage(driver);
		loginpage.loginCredential();
		
		loginpage.text_UserName.clear();
		loginpage.text_UserName.sendKeys("mngr511845");
		Thread.sleep(2000);
		
		
		loginpage.text_Password.clear();
		loginpage.text_Password.sendKeys("jYmetet");
		Thread.sleep(2000);
		
		
		HomePage homepage = new HomePage(driver);
		homepage.clickLogin();
		
		homepage.button_Login.click();
		Thread.sleep(2000);
		
		LogOutPage logoutpage = new LogOutPage(driver);
		logoutpage.signOut();
		
		logoutpage.link_LogOut.click();
		Thread.sleep(2000);
	
		
		Alert alert = driver.switchTo().alert();		
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(2000);
	
	}

}
