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
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter First number: ");
        int numb1 = sc.nextInt();
        System.out.print("Enter Second number:" );
        int numb2 = sc.nextInt();
        System.out.print("Enter Third number:" );
        int numb3 = sc.nextInt();
        
        int average = (numb1 + numb2 + numb3) /3;
        System.out.println("Average" + average);
        
        
    }
}
