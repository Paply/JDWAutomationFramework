package com.qlcadda;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopNav {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonu\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		
		try 
		{
			//cookies
		WebElement AcceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		AcceptCookies.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		
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
        
		
		String[] UrlVal=new String[topnavLst.size()];
		int i=0;
		
		for(WebElement w : topnavLst )
		{
			String url=w.getAttribute("href");
			UrlVal[i++]=url;	
		}
		System.out.println(UrlVal.length);
		for(int j=0;j<=UrlVal.length-1;j++)
		{
			String url=UrlVal[j];
			driver.navigate().to(url);
			Thread.sleep(2000);
			
			List<WebElement> lst=driver.findElements(By.xpath("//span[text()='Home']"));
			if(lst.size()>=1)
			{
				System.out.println("We are in PLP Page");
				
			}
			else
			{
				System.out.println("We are not in PLP page");
			}
		}
		

	}

}
