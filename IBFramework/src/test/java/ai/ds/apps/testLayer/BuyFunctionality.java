package ai.ds.apps.testLayer;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.DashboardPage;
import ai.ds.apps.pageLayer.ExchangePage;
import ai.ds.apps.pageLayer.LoginPage;
import ai.ds.apps.testBase.TestBase;


public class BuyFunctionality extends TestBase
{
	//WebDriver driver;
	
	@Test
	public void verifyBuyFunctionality() throws InterruptedException
	{
		String expected_op= "Order Created successfully";
		//LoginPage login=new LoginPage(driver);
		
		//--------for LOGIN into the DalalStreet.ai------------
		/*login.emailID("sweeram07@gmail.com");
		Thread.sleep(3000);
		login.password("Password@1990");
		Thread.sleep(3000);
		login.clickOnLoginButton();
		Thread.sleep(3000);*/
		
		//--------for searching a share of WIPRO on dashboard------------
		//DashboardPage dash=new DashboardPage(driver); 
		dash.enterCompanyName("Wipro");
		Thread.sleep(3000);
		dash.selectOption();
		Thread.sleep(3000);
		
		//--------for buying the WIPRO share from exchange----------
		
		//ExchangePage ex=new ExchangePage(driver);
		ex.clickOnButton1();
		ex.EnetrQuantity();
		ex.clickOnButton2();
		Thread.sleep(3000);
		
		Assert.assertEquals(ex.getStatus(), expected_op);
		
	
	}
}
