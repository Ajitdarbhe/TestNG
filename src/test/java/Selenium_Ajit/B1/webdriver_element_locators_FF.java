package Selenium_Ajit.B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver_element_locators_FF {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default");
		System.out.println("Webdriver find element is by name");
		d.findElement(By.name("FirstName")).sendKeys("Ajit");
		System.out.println("Clear element in frist name field");
		Thread.sleep(10);
		//d.findElement(By.id("firstname-placeholder")).clear();
		//Thread.sleep(10);
		System.out.println("Element is displayed");
		//d.findElement(By.id("firstname-placeholder")).isDisplayed();
		System.out.println("Webdriver find by id ");
		d.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Darbhe");
		
		System.out.println("Clear element in last name field");
		//d.findElement(By.id("lastname-placeholder")).clear();
		d.manage().window().maximize();
		//System.out.println("Click on Submit button");
		//d.findElement(By.id("submitbutton")).click();
		
		

	}

}
