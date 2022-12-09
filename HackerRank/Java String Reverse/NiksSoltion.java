import java.io.*;
import java.util.*;

public class NiksSoltion {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean b=true;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0,j=A.length()-1; i<=j; i++,j--){
            if(A.charAt(i)!= A.charAt(j)){
                b=false;
                break;
            }
        }
        if(b==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
