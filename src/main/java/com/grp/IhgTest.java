package com.grp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IhgTest {
@Test(groups= {"regression","sanity"})
	public void ihg()
	{
	 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());	
	}
}
