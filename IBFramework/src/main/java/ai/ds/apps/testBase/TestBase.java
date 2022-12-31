package ai.ds.apps.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ai.ds.apps.pageLayer.DashboardPage;
import ai.ds.apps.pageLayer.ExchangePage;
import ai.ds.apps.pageLayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public WebDriver driver;
	public LoginPage login;
	public DashboardPage dash;
	public ExchangePage ex;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws InterruptedException
	{
		
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Wrong Driver");
		}
		
		String url="https://apps.dalalstreet.ai/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		new LoginPage(driver);
		
		//--------------Object Creation---------------
		login=new LoginPage(driver);
		dash=new DashboardPage(driver);
		ex=new ExchangePage(driver);
		//--------------Login Steps-------------------
		
		login.emailID("sweeram07@gmail.com");
		login.password("Password@1990");
		login.clickOnLoginButton();
		Thread.sleep(4000);
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
