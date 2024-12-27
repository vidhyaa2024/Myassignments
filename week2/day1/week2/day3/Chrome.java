package week2.day3;

public class Chrome extends Broswer
{
	public void openIncognito() 
	{
		System.out.println("OpenIncognito");
	}
	
	public void clearCache() 
	{
		System.out.println("clearcache");
	}

	public static void main(String[] args) 
	{
		Chrome Ch=new Chrome();
		Ch.openURL();
		Ch.closeBrowser();
		Ch.navigateBack();
		Ch.openIncognito();
		Ch.clearCache();

	}

}
