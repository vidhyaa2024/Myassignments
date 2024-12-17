package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      int [] number= {2,5,7,7,9,2,3}; // Variable declaration
   // Sorting the numbers in asending order
      /*
      Arrays.sort(number);
      for (int i = 0; i <= number.length; i++)
      {
    	  System.out.println(" Acending order :" + number[i]);
		
	}*/
      
      // Finding the duplicate numbers
      Arrays.sort(number);
      for (int i = 0; i < number.length; i++)
      {
		for (int j = i+1; j<number.length; j++) 
		{
			if(number[i]==number[j])
			{
			System.out.println(" Duplicate numbers:"+number[j]);
			}
		}
      }
      }
	}

      
      
     
      


