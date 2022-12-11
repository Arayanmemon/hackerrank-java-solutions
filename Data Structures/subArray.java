import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                    
                }
                if (sum<0) {
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
