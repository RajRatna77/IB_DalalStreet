package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class LoginPage extends TestBase
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//------------Object Repository-----------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_textbox;
	 
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_button;
	
	
	//------------Action Method---------------
	public void emailID(String emailaddress)
	{
		email_textbox.sendKeys(emailaddress);
		
	}
	
	public void password(String pass)
	{
		
		password_textbox.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	
	public String getCUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
}
