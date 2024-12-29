package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	private static WebElement element;
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver(); // ChromeDriver
		driver.get("https://www.pvrcinemas.com/"); // Load the PVRCinemas URL
		driver.manage().window().maximize(); // Maximize the Screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Selenium Wait implicit
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Chennai')]")).click();
	    driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	    
	    // Select the Movie name
	    driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
	  
	    // select the Date
	    driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
	    
	    //Select the movie
	  
	    driver.findElement(By.xpath("(//span[text()='MUFASA: THE LION KING'])[2]")).click();
	   
	    //Select the time
	    driver.findElement(By.xpath("//span[text()='10:00 PM']")).click();
	    
	    //click on book button
	    
	    driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
	    
	    // Accept terms and Condition
	    driver.findElement(By.xpath("//button[text()='Accept']")).click();
	    
	    // Selecting the seat 

	    driver.findElement(By.xpath("(//span[text()='21'])[1]")).click();
	    driver.findElement(By.xpath("(//span[text()='20'])[1]")).click();
	    Thread.sleep(2000);
	    
	    // Proceed button
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    
	    //Printing the Seat number
	    
	    String Seat1 = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
	    System.out.println("Seat number:"+Seat1);
	    
	    String Seat2= driver.findElement(By.xpath("(//div[@class='seat-number'])[2]")).getText();
	    System.out.println("Seat number:"+Seat2);
	    
	   
	    //Proceed button
	    driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
	    
	    //Close the POP UP
	    
	    driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
	    
	    //Print the title
	    String title = driver.getTitle();	    
		System.out.println("Title name :" +title);
		
			
		
		
		
		

	}

}
