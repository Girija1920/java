package com.selenium;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("email")).sendKeys("girija123");
	    
	    driver.findElement(By.name("pass")).sendKeys("123456789");
	    
	   // driver.findElement(By.name("login")).click();
	    WebElement a = driver.findElement(By.xpath("//a[text()='Create a Page']"));
	    System.out.println(a.getText());
	    
	    WebElement b = driver.findElement(By.xpath("//h2[contains(text(),'with')]"));
	    System.out.println(b.getText());
	    
	    WebElement c = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    c.click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("firstname")).sendKeys("Akash");
	    
	    driver.findElement(By.name("lastname")).sendKeys("s");
	    
	    driver.findElement(By.name("reg_email__")).sendKeys("akash");
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
	    
	    WebElement day = driver.findElement(By.id("day"));
	    
	    Select s = new Select(day);
	    s.selectByValue("20");
	    
	    WebElement month = driver.findElement(By.id("month"));
	    
	    Select s1 = new Select (month);
	    s1.selectByVisibleText("Apr");
	    
	    WebElement year = driver.findElement(By.id("year"));
	    
	    Select s2= new Select(year);
	    s2.selectByValue("1997");
	    
	    WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	    gender.click();
	    
	    WebElement sign = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
	    sign.click();
	    
	    Thread.sleep(5000);
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
		File a1 = ts.getScreenshotAs(OutputType.FILE);
		File b2 = new File("C:\\Users\\vgirija\\eclipse-workspace\\selenium\\pic\\snap.png");
		
		FileUtils.copyFile(a1, b2);
		
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    

	    

	    
	    

	    
	
	
	
	
	}
}
