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
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input distance in meters: ");
        Double a = sc.nextDouble();
        System.out.print("Input hour: ");
        Double b = sc.nextDouble();
        System.out.print("Input minutes: ");
        Double c = sc.nextDouble();
        System.out.print("Input seconds:");
        Double d = sc.nextDouble();
        
        Double totime = b * 3600 + c *60 + d;
        Double f = a / totime;
        Double g = f * 3.6;
        Double h = f * 2.23694;
        
        System.out.printf("Your speed in meters/second is %.8f%n", f);
        System.out.printf("Your speed in km/h is %.8f%n", g);
        System.out.printf("Your speed in miles/h is %.8f%n", h);
        
        
        
        
        
        
        
        
    }
}