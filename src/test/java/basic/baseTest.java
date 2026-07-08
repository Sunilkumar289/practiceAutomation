package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	 private static final Logger logger = LogManager.getLogger(baseTest.class);
    protected WebDriver driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
        String Execution = System.getProperty("execution", "local");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        if (Execution.equalsIgnoreCase("remote")) {
            driver = new RemoteWebDriver(
                new URL("http://selenium-chrome:4444/wd/hub"),
                options
            );
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            String googleTitle =driver.getTitle();
            logger.info("google application is launched: {}",googleTitle );
    	
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // closes all windows and ends session cleanly
        }
    }
}
