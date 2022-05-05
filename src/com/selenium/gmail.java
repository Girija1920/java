package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.name("firstName")).sendKeys("ak");
		
		driver.findElement(By.name("lastName")).sendKeys("s");
		
		driver.findElement(By.name("Username")).sendKeys("akgiri3456");
		
		driver.findElement(By.name("Passwd")).sendKeys("123456789");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//div[@type='button']")).click();
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
