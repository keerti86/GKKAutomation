package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IhgAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("firstName")).sendKeys("keerthi");
		driver.findElement(By.id("lastName")).sendKeys("gurram");
		driver.findElement(By.id("email")).sendKeys("kg@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("kg@gmail.com");
		driver.findElement(By.id("password")).sendKeys("aaaa");
		driver.findElement(By.id("confirmPassword")).sendKeys("aaaa");
		driver.findElement(By.id("country")).click();
		driver.findElement(By.id("address1")).sendKeys("riogrande dr");
		driver.findElement(By.id("address2")).sendKeys("avelon st");
		driver.findElement(By.id("city")).sendKeys("Tracy");
		driver.findElement(By.id("state")).sendKeys("CA");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		
		
		
	}

}
