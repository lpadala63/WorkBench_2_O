package stepdefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.WebDriverRunner;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.GetDataFromExcel;

import static com.codeborne.selenide.Selenide.open;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HooksTest{
	GetDataFromExcel ReadData = new GetDataFromExcel();
	public static WebDriver idriver;
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	public static Scenario scenario;
	String url = "";
	String prop = "";
	
	
	
	
	@Before
	public void InitialTest(Scenario scenario) throws Exception
	{
		System.out.println("InitialTest");
		prop = System.getProperty("env");
		System.out.println("environment value   "+prop);
		beforeTests(prop);
		url = TestPropertyFileRead.getThePropertyValue("URl");
		//url = TestPropertyFileRead.getThePropertyValue("Ez_App_Direct");
		Configuration.browser = "chrome";
		open(url);
		idriver = WebDriverRunner.getWebDriver();
		idriver.manage().window().maximize();
		Configuration.timeout = 70000;
		idriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 GlobalCap.gwebDriver=idriver ;
		HooksTest.scenario=scenario;
        System.out.println("WorkBench execution started");
	} 
	
	@After
	public void CloseTest(Scenario scenario) throws Exception
	{
		addScreenshot(scenario);
		System.out.println("CloseTest");
//		HooksTest.idriver.close();
		
	}
	
	public void beforeTests(String env) throws IOException
	{
		try
		{
			if(env.equals(null) || env.equals(""))
				System.out.println("environment condition not added is:  "+ env);
			
		}catch (NullPointerException a) {
			env = "dev";
			System.out.println("environment considered as:  "+ env);
		}
		
		testPropertyFileRead.envTest(env);
	}
	
	public void addScreenshot(Scenario scenario) throws Exception{
		
		String filepath = System.getProperty("user.dir") + "/TestResults/screenshots";
		File theDir = new File(filepath);
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
		
		if (scenario.isFailed()) {
			 String screenshotName = scenario.getName().replaceAll(" ", "_");
			 try {
			 File sourcePath = ((TakesScreenshot)idriver).getScreenshotAs(OutputType.FILE);
			 File destinationPath = new File(filepath+ "/"+ screenshotName + ".png");
			 Files.copy(sourcePath, destinationPath);   
			 Reporter.addScreenCaptureFromPath(destinationPath.toString());
			 } catch (Exception e) {
				 System.out.println("The screenshot exceptions"+e.toString());
			 } 
			 }
		

	}

}
