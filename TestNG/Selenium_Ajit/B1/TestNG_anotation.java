package Selenium_Ajit.B1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_anotation 
{
	
	WebDriver d;
	
	@BeforeMethod 
	public void meth() 
	{

		System.setProperty("webdriver.chrome.driver", "D:/Ajit_Selenium_Drivers/chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().fullscreen();
		//d.manage().deleteAllCookies();
		d.get("https://www.google.co.in/");
		//d.navigate().to("https://www.google.co.in/");
		
	}
	@Test
	public void Title() 
	{
		String tit=d.getTitle();
		System.out.println(tit);
		//String s="Google";
		if( tit.equals("Google")) 
		{
			System.out.println("coorct web page was opened ");
		}
		else
			System.out.println("not correct ");
		
	}
	@Test
	public void Url() 
	{
		String url=d.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.google.co.in/")) 
		{
			System.out.println("Google was opened ");
		}
	}
	@AfterMethod
	public void close() 
	{
		d.quit();
		System.out.println("Browser was close");
	}

}
