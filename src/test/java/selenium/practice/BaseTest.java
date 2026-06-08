package selenium.practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	@Test()
	public void luanchApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign in']")));
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
