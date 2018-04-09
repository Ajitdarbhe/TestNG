package Selenium_Ajit.B1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_FF_basic {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
		String a=d.getTitle();
		if(a.contains("Google")) 
		{
			System.out.println(d.getTitle());
			System.out.println("Page open succesfully");
		}
		else
		{
			System.out.println("page was not open correctly");
		}
		System.out.println(d.getCurrentUrl());
		d.manage().window().maximize();
		d.quit();
		d.close();
		

	}

}
