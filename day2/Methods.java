package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");  // Amazon URL
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("CUET Economics Book 2025",Keys.ENTER);
        //driver.findElement(By.id("nav-search-submit-button")).click();
        
        // Get the Title
        String title = driver.getTitle();
        System.out.println("First Book title: "+title);
       // Print the Book Title 
        String Bookname = driver.findElement(By.xpath("//span[contains(text(),'CUET Economics Book 2025')]")).getText();
        System.out.println("Book Name is : "+Bookname);
        // Print the Amount of the book 
        String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("Prize of the Book: " +text);
       
    /*    String replaceAll = text.replaceAll(",","");
        System.out.println("Replace the camma into Space: "+replaceAll); // Replace the camma into Space
        int int1 = Integer.parseInt(replaceAll); // Convert string to int
       
        System.out.println("Convert into integer: "+int1); */
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
