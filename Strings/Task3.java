import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String r="";
        for (int i = A.length()-1; i >= 0; i--) {
            r = r + A.charAt(i);
        }
        if(r.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



