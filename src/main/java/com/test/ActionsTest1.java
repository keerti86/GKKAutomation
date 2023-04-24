package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Actions a=new Actions(driver);
		a.sendKeys(username, "rama").build().perform();
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Actions a1=new Actions(driver);
		a1.sendKeys(password, "1234").build().perform();
		
	}

}
