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
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a degree in Fahrenheit: ");
        Double a = sc.nextDouble();
        
        Double b = (a - 32) * 5 / 9;
        
        System.out.println(a + " degrees Fahrenheit is equal to " + b + " in Celsius:" );
    }
    
}
