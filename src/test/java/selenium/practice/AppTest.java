package selenium.practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	 WebDriver driver;
    
  @Test(dataProvider = "testjson" ,dataProviderClass = readJson.class)
  
  public void testInfo(String name,String lastName,String id) {
    
	System.out.println(name+ " "+lastName+" "+id);
	  
	  }
  
  
  
 
}
