import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            
        String[] strs = s.split("['!?,._@ ]+");
        System.out.println(strs.length);
        for (String str : strs) {
            System.out.println(str);
        }
    }
        
    }
}

