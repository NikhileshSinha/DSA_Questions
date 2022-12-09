import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        boolean flag = false;
        for (int i = 0, j = size - 1; i < size && j >= 0; i++, j--)
            if (input.charAt(i) != input.charAt(j)) flag = true;
        
        if (flag)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
