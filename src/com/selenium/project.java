package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project {
	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			
			driver.findElement(By.id("email_create")).sendKeys("girijavetrivel20@gmail.com");
			
			driver.findElement(By.id("SubmitCreate")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("(//div[@class='radio'])[2]")).click();
			
			driver.findElement(By.id("customer_firstname")).sendKeys("girija");
			
			driver.findElement(By.id("customer_lastname")).sendKeys("v");
			
			driver.findElement(By.id("passwd")).sendKeys("Giri@123");
			
			WebElement day = driver.findElement(By.id("days"));
			
			Select s = new Select(day);
			s.selectByIndex(19);
			

			WebElement mt = driver.findElement(By.id("months"));
			
			Select s1 = new Select(mt);
			s1.selectByValue("4");
		
			

			WebElement yr = driver.findElement(By.id("years"));
			
			Select s2 = new Select(yr);
			s2.selectByValue("1999");
			
			driver.findElement(By.id("firstname")).sendKeys("kumaresh");
           
			driver.findElement(By.id("lastname")).sendKeys("v");
 
			driver.findElement(By.id("company")).sendKeys("Cts");

			driver.findElement(By.id("address1")).sendKeys("NO 23");
           
			driver.findElement(By.id("address2")).sendKeys("absc nagar");
 
			driver.findElement(By.id("city")).sendKeys("Chennai");
			
			WebElement st = driver.findElement(By.id("id_state"));
			
			Select s3 = new Select(st);
			s3.selectByVisibleText("Indiana");
			
			driver.findElement(By.id("postcode")).sendKeys("60071");
			
			WebElement cn = driver.findElement(By.id("id_country"));
			
			Select s4 = new Select(cn);
			s4.selectByVisibleText("United States");
			
			driver.findElement(By.id("phone")).sendKeys("8610056031");

			driver.findElement(By.id("phone_mobile")).sendKeys("7338925647");

			driver.findElement(By.id("alias")).sendKeys("vg");
			
			driver.findElement(By.id("submitAccount")).click();

			
			
			
			


			
			
			
		
		
		
		
		
		
		
		
		
	}

}
