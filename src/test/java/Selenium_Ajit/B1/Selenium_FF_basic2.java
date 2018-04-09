package Selenium_Ajit.B1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_FF_basic2 {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		System.out.println("Load page is"+d.getTitle());
		d.navigate().to("https://accounts.google.com/");
		System.out.println("Load page is "+d.getTitle());
		
		d.navigate().back();
		System.out.println("When page is back "+d.getTitle());
		d.navigate().forward();
		System.out.println("When page is Forward "+d.getTitle());
		d.navigate().refresh();
		System.out.println("Page was Refreshed ");
		d.close();
		

	}

}
