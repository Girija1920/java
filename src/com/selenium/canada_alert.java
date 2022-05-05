package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class canada_alert {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
	
		WebElement signin = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		signin.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
