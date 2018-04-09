package Selenium_Ajit.B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *Basic Selenium program 
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	
    		WebDriver d=new FirefoxDriver();
    		
            d.get("https://www.google.co.in/");
            d.findElement(By.name("q")).sendKeys("facebook");
            Thread.sleep(10);
            d.findElement(By.name("btnK")).click();
    		
    	
        
        
        
    }
}
