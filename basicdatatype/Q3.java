/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatype;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long min = scanner.nextLong();
        
        //To calculate the minutes per day 3456789
        long minperday = 60 * 24;
        //To calculate the minutes per year
        long minperyear = minperday * 365;
        //To get the year 
        long years = min / minperyear;
        
        long reminutes = min % minperyear;
        long days = reminutes / minperday;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");
  
    }
}
