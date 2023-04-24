package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement design = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(design);
		WebElement alpha = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement beta = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(alpha, beta).build().perform();
	}

}
