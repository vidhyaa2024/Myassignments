package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "TestLeaf";
		 char[] c= name.toCharArray();
		 for (int i = c.length-1; i >=0; i--)
		 {
			 System.out.print( c[i]);
		}
		 

	}

}
