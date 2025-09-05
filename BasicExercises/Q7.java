/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicExercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q7 {
    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        System.out.println("Multiplication Table for: " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        
            
        
        
        scanner.close();
    }
}