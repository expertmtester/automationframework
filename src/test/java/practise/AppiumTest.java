package practise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Listeners;

public class AppiumTest{

	//enabling log4j logging into the test case
	
	private static Logger log=LogManager.getLogger(AppiumTest.class.getName());
	@Test
	public void run()
	{    Assert.assertTrue(false);
		System.out.println("I am running Appium test");
		
		log.info("i am showing info message");
		log.warn("i am showing warning");
		log.debug("i am showing debugging msg");
		log.fatal("i am showing fatal error");
		log.error("i am showing error");
	}
}
