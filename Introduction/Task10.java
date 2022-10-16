// Java Static Initializer Block

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Solution {
    static int B;
    static int H;
    public static boolean flag = staticCode();
    public static boolean staticCode(){
       Scanner sc = new Scanner(System.in);
       B = sc.nextInt();
       H = sc.nextInt();
       try{
       if (B<=0 || H<=0) {
           throw new Exception("Breadth and height must be positive");
       } else {
           return true;
       }
       }catch(Exception e){System.out.println(e); return false;}
   }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

