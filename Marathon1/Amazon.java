package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver(); // ChromeDriver
		driver.get("https://www.amazon.in/"); // Load the Amazon URL
		driver.manage().window().maximize(); // Maximize the Screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Selenium Wait implicit
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER); // Enter the Bags in search bar
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//span[contains(text(),'results ')]")).getText(); // get the result text
		System.out.println("Result: "+result);
		
	/*    WebElement element = driver.findElement(By.className("a-button-text a-declarative"));
		Select sort=new Select(element);
		sort.selectByVisibleText("Newest Arrivals");*/
		// driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
// Select the Brands
	   // driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[4]")).click();
	    driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[5]")).click();
		String bagname = driver.findElement(By.xpath("//span[contains(text(),'Omega spacious')]")).getText();
		System.out.println("Bag name :"+bagname);
		String text = driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText();
		System.out.println("Amount: "+text);
	    int int1 = Integer.parseInt(text);
		System.out.println(int1);
		Thread.sleep(2000);
	//	driver.close();
		
		

	}

}
