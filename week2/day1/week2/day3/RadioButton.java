package week2.day3;

public class RadioButton extends Button
 {
    public void  selectRadioButton()
    {
    	System.out.println("Select Radio button from Radio button subclass");
    }
	public static void main(String[] args)
	{
		RadioButton Rb = new RadioButton();
		Rb.click();// Webelemt class method
		Rb.setText("From Webelement Base class"); // Webelemt class method
		Rb.submit(); // Button subclass method
		Rb.selectRadioButton(); // Radiobutton subclass method
		

	}

}
