package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_login {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("girija");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456789");
		
		WebElement in = driver.findElement(By.xpath("//button[@type='submit']"));
		in.click();
		
		Thread.sleep(3000);

		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File a = ts.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\vgirija\\eclipse-workspace\\selenium\\pic\\snap.png");
		
		FileUtils.copyFile(a, b);
		
		
		
		
		
		
	}

}
