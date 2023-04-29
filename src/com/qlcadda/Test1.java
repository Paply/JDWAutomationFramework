package com.qlcadda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception 
			{
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonu\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//pass URL
			driver.get("https://www.jdwilliams.co.uk/");
			
			//cookies
			WebElement AcceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
			AcceptCookies.click();
			
			//Click on NewIN
			WebElement NewIN=driver.findElement(By.id("topNav_NewIn"));
			NewIN.click();
			
			//Select Blue

			WebElement SelectBlue = driver.findElement(By.xpath("//span[text()='Blue']"));
			SelectBlue.click();
			
			Thread.sleep(3000);    
			
			//select product from Plp page
			WebElement SelectPrdct=driver.findElement(By.xpath("(//img[@class='js-plp-image'])[3]"));
			SelectPrdct.click();
			}

	


	}


