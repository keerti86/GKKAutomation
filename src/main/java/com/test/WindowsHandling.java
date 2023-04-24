package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> all = driver.getWindowHandles();
		System.out.println(all.size());
		Iterator<String> it = all.iterator();
		while(it.hasNext())
		{
			String linkedIN=it.next();
			if(!parent.equals(linkedIN))
			{
				driver.switchTo().window(linkedIN);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	
	}

}
