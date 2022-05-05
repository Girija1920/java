package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("promtButton")).click();
		
		//driver.switchTo().alert().sendKeys("giri");
		
	//	driver.switchTo().alert().accept();
		
	//	driver.findElement(By.id("confirmButton")).click();
		
		
		
		
		
		

}
}
