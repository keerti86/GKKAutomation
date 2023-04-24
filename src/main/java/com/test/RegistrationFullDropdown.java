package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFullDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("keerthi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gurram");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("2000 reo grande, CA");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("keer@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
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
		
		 
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s1=new Select(skills);
		//s1.selectByValue("Android");
		s1.selectByVisibleText("Android");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		
		

		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s3=new Select(year);
		s3.selectByValue("1917");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4=new Select(month);
		s4.selectByVisibleText("February");
		
	   WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
	   Select s5=new Select(day);
	   s5.selectByValue("3");
	   
		
	   
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1111");
	   driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("1111");
	   
	  
	   
	   
		
		
		
		
		
		
		
		

	

}
}
