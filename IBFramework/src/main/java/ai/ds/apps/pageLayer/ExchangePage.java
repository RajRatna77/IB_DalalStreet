package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ai.ds.apps.testBase.TestBase;
import ai.ds.apps.utilities.ScrollClass;

public class ExchangePage extends TestBase
{
	WebDriver driver;
	public ExchangePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//-------------Object Repository----------//
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_textbox;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	
	//-------------Action Methods-------------//
	
	public void clickOnButton1()
	{
		buy_btn1.click();
	}
	
	public void EnetrQuantity()
	{
		quantity_textbox.click();
		quantity_textbox.sendKeys("2");
	}

	
	@Test
	public void clickOnButton2() throws InterruptedException
	{
		ScrollClass sd=new ScrollClass(driver);
		
		sd.scrollDown();
		
		buy_btn2.click();
	}
	
	public String getStatus()
	{
		String st=status.getText();
		return st;
	}
}
