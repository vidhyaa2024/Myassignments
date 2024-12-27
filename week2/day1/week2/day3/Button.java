package week2.day3;

public class Button extends WebElement
{
	
    public void submit()
    {
    System.out.println("Submit method");
    }
	public static void main(String[] args)
	
	{
		Button but=new Button();
		but.click(); // WebElement class method
		but.setText("Subclass button"); // WebElement class  method
		but.submit(); // Button class method

	}

}
