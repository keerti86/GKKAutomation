package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDisplayEnabled {

	public static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	       driver=new ChromeDriver();
	        SelectDisplayEnabled sde=new SelectDisplayEnabled();
	        
	      driver.get("https://demo.automationtesting.in/Register.html");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
	     System.out.println(radio.isDisplayed());
	    System.out.println(radio.isSelected());
	    radio.click();
	    System.out.println(radio.isSelected());
	    System.out.println(radio.isEnabled());
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Gayatri");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Davuluri");  
        driver.findElement(By.xpath("//div[@class='form-group']/following::textarea")).sendKeys("180,Hazyhills Ln,Garner");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gayatri.siri22@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("666666666");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select s=new Select(skills);
        s.selectByVisibleText("Android");
        sde.snap();
        
	}
	public void snap() throws IOException
	{
	  File src = driver.getScreenshotAs(OutputType.FILE);
	  File dst=new File(".//Images//pic1.png");
	  FileUtils.copyFile(src, dst);
	  }
	

}