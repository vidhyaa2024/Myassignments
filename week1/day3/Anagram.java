package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String T1 ="Stops";
		String T2= "potss";
		
// lengths of the two strings are equal:		
		
		int length1 = T1.length();
		int length2 = T2.length();
		if(length1==length2)
		{
			System.out.println(" It's equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		//Convert both the strings to character arrays

     char[] charArr1 = T1.toCharArray();
     for (int i = 0; i < charArr1.length; i++) 
     {
		System.out.println(charArr1[i]);
	}
     char[] charArr2 = T2.toCharArray();
     
     for (int i = 0; i < charArr2.length; i++) 
     {
		System.out.println(charArr2[i]);
	}
    
     // Sort both the character arrays
     Arrays.sort(charArr1);
     Arrays.sort(charArr2);
     
     if(charArr1 == charArr2)
     {
    	 System.out.println("The given strings are Anagram.");
     }
     else
     {
    	 System.out.println("The given strings are not an Anagram.");
     }
     
     
	}

}
