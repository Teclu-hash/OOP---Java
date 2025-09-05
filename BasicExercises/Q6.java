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
public class Q6 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        
        System.out.print("Enter First number: ");
        int numb1 = sc.nextInt();
        System.out.print("Enter Second number:" );
        int numb2 = sc.nextInt();
       
        a = numb1 + numb2;
        b = numb1 - numb2;
        c = numb1 * numb2;
        d = numb1 / numb2;
        e = numb1 % numb2;
      
        System.out.println(numb1 + " + " + numb2 + " = " + a);
        System.out.println(numb1 + " - " + numb2 + " = " + b);
        System.out.println(numb1 + " x " + numb2 + " = " + c);
        System.out.println(numb1 + " / " + numb2 + " = " + d);
        System.out.println(numb1 + " % " + numb2 + " = " + e);
        
        
         
    }
}
