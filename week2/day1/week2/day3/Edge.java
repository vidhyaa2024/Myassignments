package week2.day3;

public class Edge extends Broswer
{

	public void  takeSnap()
	{
		System.out.println("TakeSnap");
	}
	public void clearCookies()
	{
		System.out.println("clearCookies");
	}
	public static void main(String[] args) 
	{
	 Edge Ed=new Edge();
	 Ed.openURL();
	 Ed.closeBrowser();
	 Ed.navigateBack();
	 Ed.takeSnap();
	 Ed.clearCookies();

	}

}
