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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: : ");
        double weight = scanner.nextDouble();
       
        System.out.print("Enter your height in inches: ");
        double height = scanner.nextDouble();
        
        double bmi = weight * 0.4535923 / (height *0.0254 * height * 0.0254);
      
        System.out.printf("Your BMI is: %.2f\n", bmi);
        scanner.close();
    }
}

