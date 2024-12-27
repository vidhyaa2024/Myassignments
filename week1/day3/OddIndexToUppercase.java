package week1.day3;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val ="changeme";
		
		char[] charArr= val.toCharArray(); // Convert the given String to a character array
	//	System.out.println(charArr);
		for (int i = charArr.length-1; i >=0 ; i--) 
			
			
			if(i%2 ==1)
			{ 
				
			    System.out.println(i);
			 String j= val.toUpperCase();
			    System.out.println(j);   
			   // System.out.println(UpCase);
				
				   
			}
			else
			{
			//	System.out.println(i);
			}
		       
	
		
			
			
		}

	}


