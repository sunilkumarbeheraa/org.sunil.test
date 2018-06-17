package com.org.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindXAndYCordinate
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://play.google.com/store/apps/details?id=sun.way2sms.hyd.com");
		
		WebElement temsandpolicies=driver.findElement(By.linkText("Terms of Service"));
		
		//Find out x and y coordinate of perticular section
		Point location=temsandpolicies.getLocation();
		int xcordinate=location.getX();
		int ycoordinate=location.getY();
		System.out.println(xcordinate+" "+ycoordinate);
		
		//String and integer merge into string
		/*String s="window.scrollBy(";
		String s1=")";
		String s3=Integer.toString(xcordinate);
		String s4=Integer.toString(ycoordinate);
		String mergestring=s+s3+","+s4+s1;*/
		
		
		
		String allmergestring="window.scrollBy("+Integer.toString(xcordinate)+","+Integer.toString(ycoordinate)+")";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(allmergestring, "");
		
		temsandpolicies.click();
		
		
		Set<String> windowhandel=driver.getWindowHandles();
		Iterator<String> itr=windowhandel.iterator();
		String mainwindow=itr.next();
		String secondwindow=itr.next();
		driver.switchTo().window(secondwindow).close();
		driver.switchTo().window(mainwindow).close();
		
		
		
		
		
		
		
	}
	
	
	
}
