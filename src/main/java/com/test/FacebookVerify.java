package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

public class FacebookVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String exp="https://www.facebookcom/";
		String act = driver.getCurrentUrl();
		SoftAssert safe=new SoftAssert();
		
		safe.assertTrue(exp.equals(act));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("aaaa");
	
	}

}
