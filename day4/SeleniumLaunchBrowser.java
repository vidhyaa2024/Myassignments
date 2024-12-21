package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open the Browser
		ChromeDriver driver= new ChromeDriver();
		
		// Launch the URL
		driver.get("http://www.facebook.com/");
		
		// Maximize the Page
		driver.manage().window().maximize();
		
		// Minimize the Page
		//driver.manage().window().minimize();
		
		
		driver.findElement(By.id("email")).sendKeys("olaytel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Success10$");
		driver.findElement(By.name("login")).click();
		
		// Waiting 
	    //Thread.sleep(100000);
		
		// Closing the Page
		
	   // driver.close();
		

	}

}
