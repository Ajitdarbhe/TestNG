package Selenium_Ajit.B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Radio_button {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		
		try {
			d.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
			d.findElement(By.xpath(".//*[@id='u_0_8']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		boolean status= true;
		status=d.findElement(By.xpath(".//*[@id='u_0_b']")).isSelected();
		System.out.println(status);
		status=d.findElement(By.xpath(".//*[@id='u_0_b']")).isDisplayed();
		System.out.println("Element was displayed "+status);
		status=d.findElement(By.xpath(".//*[@id='u_0_b']")).isEnabled();
		System.out.println("Element was enabled "+status);
		
		
	}

}
