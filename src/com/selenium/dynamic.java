package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	
	  List<Integer> product = new ArrayList<Integer>();
		
		for (WebElement web : price) {
			
			String a = web.getText().replace("Rs. ", " "); 
			 int parseInt = Integer.parseInt(a);
			 
			 product.add(parseInt);
				
			
			
			
		}
		

		Collections.sort(product,Collections.reverseOrder());
		System.out.println(product);

	  
	 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}		
		
		
		
		
		
		
		
	
}
