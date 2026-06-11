package basic;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseTest {
	
	@Test
	public void luanchApp() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");       // modern headless mode
		options.addArguments("--no-sandbox");         // recommended in containers
		options.addArguments("--disable-dev-shm-usage"); // avoids /dev/shm issues in Docker

		WebDriver driver = new RemoteWebDriver(
		    new URL("http://selenium-chrome:4444/wd/hub"),
		    options
		);
		driver.get("http://www.google.com");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign in']")));
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	   
		
	}
	
	@DataProvider(name="userDetails")
	public String[][]  data()
	{
		return new String [][]{{"sunil","salunke"},{"Yadhavi","salunke"}};
	}

}
