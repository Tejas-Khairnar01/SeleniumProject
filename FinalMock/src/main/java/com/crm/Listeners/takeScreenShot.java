package com.crm.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.Basic.BaseClass;


public class takeScreenShot extends BaseClass implements ITestListener{
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test=report.createTest(name);
		
	}


	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO,"onTestFAilure");
		test.log(Status.FAIL,name +"is failure");
		TakesScreenshot ts =(TakesScreenshot)driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}
	
	@Override
	public void onStart(ITestContext context) {
		//create extent report
		spark = new ExtentSparkReporter("./src/main/resources/ScreenShotListerns.html");
		//configure spark
		spark.config().setDocumentTitle("Dws ScreenShot");
		spark.config().setReportName("Tejas");
		spark.config().setTheme(Theme.DARK);
		//create extent report
		report = new ExtentReports();
		//configure extent report
		report.setSystemInfo("os", "Windows-11");
		report.setSystemInfo("browser", "Chrome-101");
		//attach the spark to extent report
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
}