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
public class Q5 {
    public static void main(String[] args) {
        int a;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int numb1 = sc.nextInt();
        System.out.print("Enter Second number:" );
        int numb2 = sc.nextInt();
        a = numb1 * numb2;
        System.out.println(numb1 + " x " + numb2 + " = " + a);
    }
}
