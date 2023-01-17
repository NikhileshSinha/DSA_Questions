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
		int rounds = input.nextInt();
		int playerOne = 0, playerTwo = 0, maxLeadOne = 0, maxLeadTwo = 0;
		while (rounds-- > 0) {
		    playerOne += input.nextInt();
		    playerTwo += input.nextInt();
		    if (playerOne > playerTwo) {
		        if (playerOne - playerTwo > maxLeadOne)
		            maxLeadOne = playerOne - playerTwo;
		    }
		    else {
		        if (playerTwo - playerOne > maxLeadTwo)
		            maxLeadTwo = playerTwo - playerOne;
		    }
		}
		if (maxLeadOne > maxLeadTwo)
		    System.out.println("1 " + maxLeadOne);
	    else
		    System.out.println("2 " + maxLeadTwo);
	}
}
