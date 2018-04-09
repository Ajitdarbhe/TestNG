package Selenium_Ajit.B1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Selenium_Chrom_basic {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/Ajit_Selenium_Drivers/chromedriver.exe");
		WebDriver cd=new ChromeDriver(); 
		cd.get("https://www.google.co.in/");
		System.out.println("Load page is"+cd.getTitle());
		cd.navigate().to("https://accounts.google.com/");
		System.out.println("Load page is "+cd.getTitle());
		
		cd.navigate().back();
		System.out.println("When page is back "+cd.getTitle());
		cd.navigate().forward();
		System.out.println("When page is Forward "+cd.getTitle());
		cd.navigate().refresh();
		System.out.println("Page was Refreshed ");
		cd.close();
	}

}
