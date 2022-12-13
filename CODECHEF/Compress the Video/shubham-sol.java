/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int frame[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++)
                frame[i] = sc.nextInt();

            for (int i = 1; i < n; i++) {
                if (frame[i - 1] == frame[i]) {
                    count++;
                }
            }
            System.out.println(n - count);
        }
    }
}