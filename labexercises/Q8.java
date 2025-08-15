/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        
        double area = Math.PI * radius * radius; 
        double perimeter = 2 * Math.PI * radius; 
        
        
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Perimeter (Circumference) of the circle: %.2f\n", perimeter);
        
               scanner.close();
    }
}
