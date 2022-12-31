package ai.ds.apps.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class DashboardPage extends TestBase 
{

	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//------------Object Repository-----------//
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_box;	
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private  WebElement option;
	
		
	//------------Action Methodss-----------//
	public  void enterCompanyName(String compnay_name)
	{
		search_box.sendKeys(compnay_name);
	}
	
	public void selectOption() throws InterruptedException
	{
		option.click();
		Thread.sleep(3000);
		//driver.navigate().refresh();
	}
}
