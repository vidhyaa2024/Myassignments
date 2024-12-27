package week2.day3;

public class WebElement 
{
	public void click()
	{
		System.out.println("Click Method ");
	}
	public void setText(String text)
	{
		System.out.println(" Set text method");
	}
	public static void main(String[] args) 
	{
		
		WebElement web = new WebElement();
		web.click();
		web.setText("Home Assignment");
		

	}

}
