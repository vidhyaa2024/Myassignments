package week2.day3;

public class CheckBoxButton  extends Button
{

	public void clickCheckButton()
	{
		System.out.println("Click check button in checkbox from extends the Button subclass");
	}
	public static void main(String[] args)
	{
		CheckBoxButton ch = new  CheckBoxButton();
		ch.click(); // Webelemt class method
		ch.setText("Checkbox class inherit from button "); // Webelement class method
		ch.submit(); // Button subclass method
		ch.clickCheckButton(); // checkboxbutton  sub class method
	}

}
