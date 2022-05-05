package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/pages/Dropdown.html");
	    
	    Thread.sleep(3000);
	    
	   driver.findElement(By.linkText("You can also use sendKeys to select")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //WebElement a = driver.findElement(By.name("Selenium"));
	    
//	    Select s = new Select(a);
//	    boolean multiple = s.isMultiple();
//	    System.out.println(multiple);
//	    
//	    s.selectByValue("Appium");
//	    s.selectByValue("UFT/QTP");
//	    
//	    List<WebElement> ab = s.getAllSelectedOptions();
//	    for (WebElement web : ab) {
//	    	System.out.println(web.getText());
//			
		}
	    
	    
	}   
	    
	    
	    
	    
	


