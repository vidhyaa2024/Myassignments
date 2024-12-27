package week2.day3;

public class Broswer 
{
     public String browserName;
     public String  browserVersion;
	public void openURL()
	{
		System.out.println(" OpenURL Method from Browser Class");
	}
	public void closeBrowser()
	{
		System.out.println("CloseBrowser method in Browser Class");
	}
	
	public void  navigateBack() 
	{
		System.out.println("navigate Browser method in Browser class");
	}
	
	public static void main(String[] args)
	{
		Broswer Br=new Broswer();
		Br.openURL();
		Br.closeBrowser();
		Br.navigateBack();

	}

}
