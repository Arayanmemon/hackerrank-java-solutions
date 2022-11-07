import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length()==b.length()) {
        char[] c1= a.toLowerCase().toCharArray();
        char[] c2= b.toLowerCase().toCharArray();
        Boolean[] boo = new Boolean[a.length()];
        
        for (int i = 0; i < boo.length; i++) {
            boo[i] = false;
        }// makes all entities false
        
        for (int i = 0; i < c1.length; i++) 
        {
            for (int j = i + 1; j < c1.length; j++) { 
                if (c1[i] > c1[j]) 
                {
                 char temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
        }// sorts array 1

        for (int i = 0; i < c2.length; i++) 
        {
            for (int j = i + 1; j < c2.length; j++) { 
                if (c2[i] > c2[j]) 
                {
                 char temp = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp;
                }
            }
        }// sorts array 2
        
        for(int i=0; i < c1.length; i++){
            if (c1[i]==c2[i]) {
                boo[i] = true;
            }
            if (!boo[i]) {
                    return false;
            }
        }
        return true;
    }
    else{
        return false;
    }
    }
        

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}