package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
   @Test(invocationCount=3)
	  public void amazon()
	{
	   System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
