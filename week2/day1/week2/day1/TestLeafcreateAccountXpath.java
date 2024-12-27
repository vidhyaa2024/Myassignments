package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafcreateAccountXpath {

	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	  // enter USername
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	  
	  // Password
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	  
	  //Login button
	  
	  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	  
	  // Click  CRM/SFA
	  driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();  
	  // click on account tab
	  
	  driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	  
	  // Create Account button
	  
	  driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	  
	  // Acount Name
	  
	  driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Vidhyajanakiraman2");
	  
	  //Select Industry dropdown using Select Class
	  
	  WebElement element = driver.findElement(By.name("industryEnumId"));
	  Select Ob1 =new Select(element);
	  Ob1.selectByVisibleText("Computer Software");
	  
	  // Description 
	  
	 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("\"Selenium Automation Tester");
	 
	 // ownership dropdown Using Select by visibletext
	 
	 WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
	 Select Ob2 = new Select(element2);
	 Ob2.selectByVisibleText("S-Corporation");
	 
	 // Source Dropdown Select by Value
	 
	 WebElement element3 = driver.findElement(By.id("dataSourceId"));
	 Select Ob3 = new Select(element3);
	 Ob3.selectByValue("LEAD_EMPLOYEE");
	 
	 // Marketing Campain dropdowm by selectbyIndex
	 
	 WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
	 Select Ob4=new Select(element4);
	 Ob4.selectByIndex(4);
	 
	 
	 // State
	 
	 WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
	 Select Ob5=new Select(element5);
	 Ob5.selectByValue("TX");
	 
	 // Create Accout Btn
	 
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 
	 // verify theSTitle
	 
	 String title = driver.getTitle();
	 if(title.contains("Account"))
	 {
		 System.out.println("Success");
	 }
	 
	 else 
	 { 
		 System.out.println("Failed");
	 }
	 
	}

}
