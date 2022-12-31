package ai.ds.apps.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.apps.pageLayer.LoginPage;
import ai.ds.apps.testBase.TestBase;

public class LoginPageTest extends TestBase
{
	
	@Test 
	public void verifyLogin() throws InterruptedException
	{
		
		String expected_result="https://apps.dalalstreet.ai/dashboard";
		String actual_result=login.getCUrl();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
}
