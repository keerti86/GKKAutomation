package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		al.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		al.dismiss();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		al.sendKeys("rama");
		al.accept();
			
	}

}
