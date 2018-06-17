package com.org.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSwitchAndHandel 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.way2sms.com");
		
		//Main window
		String mainwindow=driver.getWindowHandle();
		
		//Scroll down browser
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);*/
		
		
		//Click for new window
		
		driver.findElement(By.linkText("Know more")).click();;
		
		
		//Move to new window
		Set<String> allwindowswitch=driver.getWindowHandles();
		Iterator<String> itr=allwindowswitch.iterator();
		itr.next();
		
		String secondwindow=itr.next();
		driver.switchTo().window(secondwindow);
		driver.findElement(By.linkText("Top Charts")).click();
		driver.close();
		
		
		//Move to main window
		driver.switchTo().window(mainwindow);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
#org.sunil.test
