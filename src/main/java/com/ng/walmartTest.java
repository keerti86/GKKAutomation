package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class walmartTest {
  @Test
	public void walmart()
   {
	  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());   
   }
}
