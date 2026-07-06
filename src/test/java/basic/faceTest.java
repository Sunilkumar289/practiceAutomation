package basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;



public class faceTest extends baseTest {
	
	
	
	@Test
	public void facebooklaunch()
	{
		 driver.get("https://www.facebook.com");
		 String facebookTitle =driver.getTitle();
	
	}

}
