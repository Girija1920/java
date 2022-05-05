package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_amazon {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgirija\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile&crid=1YTHX33TSEBAX&sprefix=mobil%2Caps%2C211&ref=nb_sb_noss_2");
	
		List<WebElement> price = driver.findElements(By.xpath("//span[@class = 'a-price-whole']"));
     
		List<Integer> product = new ArrayList<Integer>();
	
		for (WebElement web : price) {
			
			
		String replace = web.getText().replace(",", "");
		int parseInt = Integer.parseInt(replace);
	    product.add(parseInt);
		//System.out.println(replace);

		}
		
		Collections.sort(product);	
		
		Collections.reverseOrder();
		System.out.println(product);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
