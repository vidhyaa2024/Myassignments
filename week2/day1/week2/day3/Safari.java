package week2.day3;

public class Safari extends Broswer
{

	public void  readerMode()
	{
		System.out.println("readerMode");
	}
	public void  fullScreenMode()
	{
		System.out.println("fullScreenMode");
	}
	public static void main(String[] args) 
	{ 
		Safari Sa= new Safari();
		Sa.openURL();
		Sa.closeBrowser();
		Sa.navigateBack();
		Sa.readerMode();
		Sa.fullScreenMode();
	

	}

}
