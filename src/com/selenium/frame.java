package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		int er = driver.findElements(By.tagName("iframe")).size();
		System.out.println(er);
		
		WebElement th = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(th); 
		
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("girija");
		
		driver.switchTo().defaultContent();
		
	 driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("giri");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
