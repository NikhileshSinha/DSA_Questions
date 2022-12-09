/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int arrangeCoins(int n) {
        long start, mid, end, coinsUsed;
        start = 0;
        end = n;

        while (start <= end) {
            mid = start + (end - start) / 2;
            coinsUsed = mid * (mid + 1) / 2;
            if ( coinsUsed == n) return (int) mid;
            if (coinsUsed < n) start = mid + 1;
            else end = mid - 1;
        }
        return (int) end;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while (tc-- > 0) {
		    int n = sc.nextInt();
		    System.out.println(arrangeCoins(n));
		}
	}
}
