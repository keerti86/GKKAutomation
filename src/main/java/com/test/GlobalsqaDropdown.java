package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalsqaDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		 WebElement country = driver.findElement(By.xpath("//li[@id='Select Country']/following::select"));
	    Select s=new Select(country);
	    s.selectByVisibleText("Åland Islands");
	}

}
