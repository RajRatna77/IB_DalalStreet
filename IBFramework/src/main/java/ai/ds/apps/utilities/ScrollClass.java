package ai.ds.apps.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ai.ds.apps.testBase.TestBase;

public class ScrollClass extends TestBase
{
	WebDriver driver;
	public ScrollClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scrollDown() throws InterruptedException
	{
		//JavaScriptExecutor
	      
	      JavascriptExecutor js= ((JavascriptExecutor)driver);
	     
	      Thread.sleep(3000);
	     //to scroll down
	      js.executeScript("scrollBy(0,100)"); 
	      
	       Thread.sleep(3000);
	       
	      // js.executeScript("scrollBy(0,-1650)"); 
	}
}
