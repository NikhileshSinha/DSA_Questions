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
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		
		while (tc-- > 0) {
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int d = input.nextInt();
		    
		    int diff = 0;
		    
		    if (x > y)
		        diff = x - y;
		    else
		        diff = y - x;
		        
		    
		    if (diff <= d)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
