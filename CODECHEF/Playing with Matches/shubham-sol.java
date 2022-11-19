/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
		
		int matchstick[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		
		while (tc-- > 0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int total = a + b;
		    
		    int requiredMatchStick = 0;
		    
		    while (total != 0) {
		        requiredMatchStick += matchstick[total % 10];
		        total /= 10;
		    }
            
		    System.out.println(requiredMatchStick);
		}
	}
}
