package com.flipkart.kids;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriveDemoExecution 
{
   public static void main(String[] args) throws InterruptedException
   {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Edwin\\Documents\\java_with_selenium\\workspace\\firstapp\\Drivers\\chromedriver.exe");
	  WebDriver otvardriver = new ChromeDriver();
	  otvardriver.manage().window().maximize();
	  Thread.sleep(5000);
	  otvardriver.close();
	  
	 // ChromeDriver otvardriver = new ChromeDriver();
	 //RemoteWebDriver otvardriver = new ChromeDriver();
	 //SearchContext otvardriver = new ChromeDriver(); 
		 
   }	
}