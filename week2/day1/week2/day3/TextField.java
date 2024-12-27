package week2.day3;

public class TextField extends WebElement
{
   public void getText() 
   {
	   System.out.println("get text method from Textfield subclass");
   }
	public static void main(String[] args) 
	{
		TextField text = new TextField();
		text.click();
		text.setText("Textfield subclass extendds from Webelement");
		text.getText();
	}

}
