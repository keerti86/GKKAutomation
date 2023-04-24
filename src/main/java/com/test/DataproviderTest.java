package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	@Test(dataProvider="Authentication")
	public void dpr(String id1,String id2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(id1);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(id2);
			
	}
	
	@DataProvider(name="Authentication")
	public Object[][] credentails()
	{
	return new Object[][] {{"Admin","admin123"},{"keerthi","aaaaa"}};	
	}
}
