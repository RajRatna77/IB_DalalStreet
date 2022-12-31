package ai.ds.apps.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersSetup implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		System.out.println("Started Test Execution :-"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Started Test Completed:-"+result.getName());
		System.out.println("Screenshot");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Execution Failed :-"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Execution Skipped :-"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
	
		
	}
 
}
