package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniproject_hotel {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.id("username")).sendKeys("girijavetrivel");
		
		driver.findElement(By.id("password")).sendKeys("Giri@2019");
		
		driver.findElement(By.id("login")).click();
		
		WebElement loc = driver.findElement(By.id("location"));
		
		Select s1 = new Select(loc);
		s1.selectByValue("Sydney");
		
		WebElement ht = driver.findElement(By.id("hotels"));
		
		Select s2 = new Select(ht);
		s2.selectByValue("Hotel Sunshine");
		
		WebElement rt = driver.findElement(By.id("room_type"));
		
		Select s3 = new Select(rt);
		s3.selectByValue("Double");
		
		
		WebElement rn = driver.findElement(By.id("room_nos"));
		
		Select a = new Select(rn);
		a.selectByValue("2");
		
		WebElement ar = driver.findElement(By.id("adult_room"));
		
		Select b = new Select(ar);
		b.selectByValue("2");
		
		WebElement cr = driver.findElement(By.id("child_room"));
		
		Select c = new Select(cr);
		c.selectByValue("0");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("girija");

		driver.findElement(By.id("last_name")).sendKeys("vetrivel");

		driver.findElement(By.id("address")).sendKeys("abc nagar");

		driver.findElement(By.id("cc_num")).sendKeys("3742454554001261");

        WebElement ct = driver.findElement(By.id("cc_type"));
		
		Select j = new Select(ct);
		j.selectByValue("VISA");
		
        WebElement et = driver.findElement(By.id("cc_exp_month"));
		
		Select z = new Select(et);
		z.selectByVisibleText("April");
		
		
        WebElement ey = driver.findElement(By.id("cc_exp_year"));
		
		Select m = new Select(ey);
		m.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		
	 driver.findElement(By.xpath("//input[@id='book_now']")).click();
	 
	 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//input[@id='logout']")).click();
    
	 
	 TakesScreenshot ts = (TakesScreenshot) driver;
		File a1 = ts.getScreenshotAs(OutputType.FILE);
		File b1 = new File("C:\\Users\\vgirija\\eclipse-workspace\\selenium\\pic\\snap.png");
		
		FileUtils.copyFile(a1, b1);
		
		
		

		

	



}
}
