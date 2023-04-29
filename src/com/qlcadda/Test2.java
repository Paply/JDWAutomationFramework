package com.qlcadda;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonu\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//pass URL
		driver.get("https://www.jdwilliams.co.uk/");
		
		//cookies
		WebElement AcceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		AcceptCookies.click();
		
		//verify the HomePage
		WebElement jdwlogo = driver.findElement(By.xpath("//img[@alt='JD Williams']"));
		boolean logo = jdwlogo.isDisplayed();
		
		if (logo)
		{
			System.out.println("we are in homme page");
			
		}
		else 
		{
			System.out.println(" we are not in home page");

		}
		
		//Click on All the Top Navigation
		List<WebElement> topnavLst=driver.findElements(By.xpath("//a[contains(@id,'topNav') and text()]"));
		String[] val=new String [topnavLst.size()];
		
		Iterator<WebElement> itr=topnavLst.iterator();
		while(itr.hasNext())
		{
			WebElement w1=itr.next();
			String topnavValue=w1.getText();
			System.out.println(topnavValue);
			
		}
		for (String s: val)
		{
			System.out.println(s);
			
		}
		driver.close();
		
	}

}
