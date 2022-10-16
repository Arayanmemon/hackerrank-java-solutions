// Java Currency Formatter

import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaFormat.format(payment);
        
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);
        
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}