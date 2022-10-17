import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum =(int) A.length() + B.length();
        System.out.println(sum);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.toUpperCase().substring(0, 1) + A.substring(1, A.length()) 
                         +" "+ B.toUpperCase().substring(0, 1) + B.substring(1, B.length()));
    }
}



