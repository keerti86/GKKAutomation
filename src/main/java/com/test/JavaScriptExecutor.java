package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='keerthi';");
	WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
	js.executeScript("arguments[0].value='keerthi';",user);
	WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
	js.executeScript("arguments[0].click();",button);
	


	String url="https://www.facebook.com/";
	url=js.executeScript("return document.URL;").toString();
	System.out.println(url);

	
	js.executeScript("history.go(0)");
	
	js.executeScript("window.scrollBy(0,1000)");


	}
	
	

}
