package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args)
	{
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://login.salesforce.com/?");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     // Username Advance Xpath - Parent to child
     driver.findElement(By.xpath("//div[@id='idcard-container']/input")).sendKeys("dilip@testleaf.com");
     
     //
     
     
	}

}
