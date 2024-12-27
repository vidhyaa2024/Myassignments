package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownoption {

	public static void main(String[] args)
	{
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("https://www.telerik.com/contact");
	   driver.manage().window().maximize();
	   // Create a Variable to select option
	   WebElement element1 = driver.findElement(By.name("DropdownListFieldController_0"));
	   Select obj = new Select(element1);    // Select class and object declaration
	   obj.selectByVisibleText("Account activation"); // SelectBy Visible Text
	   
	   // Product Interest
	   
	   WebElement element2 = driver.findElement(By.name("DropdownListFieldController"));
	   Select obj1= new Select(element2);
	   obj1.selectByValue("UI for WinForms");
	   
	   // Country/Territory
	   
	   WebElement element3 = driver.findElement(By.name("DynamicListFieldController"));
	   Select obj3 =new Select(element3);
	   obj3.selectByValue("India");
	   
	   
	   
	   
	   
	   
	   
	   

	}

}
