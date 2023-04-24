package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(skills);
		//s.selectByValue("Android");
		s.selectByVisibleText("Android");
		List<WebElement> all = s.getOptions();
		System.out.println(all.size());
		for(WebElement each:all)
		{
			System.out.println(each.getText());
		}
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1=new Select(year);
		s1.selectByValue("1917");
		
		
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2=new Select(month);
		s2.selectByVisibleText("February");
		
		
		
	   WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
	   Select s3=new Select(day);
	   s3.selectByValue("3");
	   
	   
	   
	}

}
