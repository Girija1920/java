package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class down {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(a).build().perform();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		//rob.keyPress(KeyEvent.VK_DOWN);
		//rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement b = driver.findElement(By.xpath("//a[text()='Fashion']"));

		act.contextClick(b).build().perform();

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		

		
		
	
}

}
