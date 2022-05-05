package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbi_alert {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		WebElement log = driver.findElement(By.className("login_button"));
		log.click();
		
		WebElement butt = driver.findElement(By.id("Button2"));
		butt.click();
		
        Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
