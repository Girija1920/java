package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc_login {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		
		a.sendKeys("girija");
		
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		driver.findElement(By.id("fldPasswordDispId")).sendKeys("girijaaa12");
		
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
