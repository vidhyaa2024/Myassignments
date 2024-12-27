package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println(" Browser launched successfully");
		return browserName;
		
	}
    protected void loadUrl()

    {
    	System.out.println("Application url loaded successfully");
    }
    
    	public static void main(String[] args) {
    
		// TODO Auto-generated method stub
    		Browser B= new Browser();
    	    String lb=B.launchBrowser("chrome");
    		System.out.println(lb);
    		B.loadUrl();
    		
    	
    		

	}

}
