package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		driver.close();
		
		
	}

}
