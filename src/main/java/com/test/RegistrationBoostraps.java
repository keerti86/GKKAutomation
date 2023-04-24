package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationBoostraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement course = driver.findElement(By.xpath("//div[@id='msdd']"));
		   course.click();
		   List<WebElement> all = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));
		   for(WebElement each:all)
		   {
			   if(each.getText().equals("Bulgarian"))
			   {
				   each.click();
				 break;
			   }
		   }
	}

}
