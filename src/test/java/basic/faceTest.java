package basic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;



public class faceTest extends baseTest {
	
	private static final Logger logger = LogManager.getLogger(baseTest.class);
	
	@Test
	public void facebooklaunch()
	{
		 driver.get("https://www.facebook.com");
		 String facebookTitle =driver.getTitle();
		 logger.info("facebook application is launched: {}",facebookTitle );
	
	}

}
