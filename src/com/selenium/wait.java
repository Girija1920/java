package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wait {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		//ACTIONS
		
		Actions act = new Actions(driver); //Right click
		
		act.contextClick(a).build().perform();	
		
		//ROBOT
		
		Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> b = driver.getWindowHandles();
		System.out.println(b);
		
		
		

		
		
	
		
		
		

}
}
