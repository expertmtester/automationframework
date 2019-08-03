package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver browserLaunch(String browsername)
	{    log.info("value from testcase: "+browsername);
		if(browsername.equalsIgnoreCase("firefox"))
		{   
			System.setProperty("webdriver.gecko.driver", "G:\\Automatiom files\\geckodriver.exe");
			log.debug("Firefox driver inilialized");
			driver= new FirefoxDriver();
			log.info("Firefox browser launched");
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Automatiom files\\chromedriver.exe");
			log.debug("Chrome driver inilialized");
			driver=new ChromeDriver();
			log.info("Chrome browser launched");
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "G:\\Automatiom files\\MicrosoftWebDriver.exe");
			log.debug("InternetExplorer driver inilialized");
			driver=new InternetExplorerDriver();
			log.info("InternetExplorer browser launched");
		}
		
		return driver;
	}
	
	public void takeScreenshot(String result) throws IOException
	{   log.info("value from testcase: "+result);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File( "C:\\Users\\Ankit\\eclipse-workspace\\AutomationFramework\\src\\test\\resources\\screenshots"+result+"screenshot.png"));
	}

}
