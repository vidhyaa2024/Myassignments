package week1.day3;

public class StringMethods {
	
	public static void main(String [] args)
	{
       // Sting length
		
		String name = "Welcome";
       int s = name.length();
       System.out.println("Total number of character in the string:" +s);
       
       // Contains - Check the words are their in the string
       
        boolean b = name.contains("Test"); //always in boolean 
       System.out.println(b);
       
       char c = name.charAt(0);
       System.out.println("Check what character in the  DB index value:" +c);
}
}
