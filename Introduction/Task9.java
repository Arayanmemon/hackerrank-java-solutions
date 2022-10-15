// Java End-of-file

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        while(sc.hasNextLine()){
        String s = sc.nextLine();
        System.out.println(count+" "+s);
        count++;
        }
    }
}