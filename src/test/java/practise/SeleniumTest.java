package practise;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Base;

public class SeleniumTest extends Base {
	
	@BeforeSuite
	@Parameters({"Browser"})
	public void launch(String Browser)
	{
		driver=browserLaunch(Browser);
		
	}
	
	@Test
	public void run()
	{
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(false);
	}

}
