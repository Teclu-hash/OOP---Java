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
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String name;
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        String add;
        String year;
        String lv; */
        
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter date of birth: ");
            String name1 = sc.nextLine();
            System.out.print("Address: ");
            String name2 = sc.nextLine();
            System.out.print("Age: ");
            String add = sc.nextLine();
            System.out.print("Course: ");
            String name3 = sc.nextLine();
            System.out.print("Year Level: ");
            String year = sc.nextLine();
            System.out.print("Secondary School Graduated: ");
            String name5 = sc.nextLine();
            System.out.print("Year: ");
            String lv = sc.nextLine();
            
            System.out.println(" ");
            
            
             
             System.out.println(" =======PERSONAL INFO=========");
             
            System.out.println(" ");
             
            System.out.printf("%-20s:%s\n","Name: ", name);
            System.out.printf("%-20s:%s\n","Date OF Birth: " , name1);
            System.out.printf("%-20s:%s\n","Address: ", name2);
            System.out.printf("%-20s:%s\n","Age: ", add);
            System.out.printf("%-20s:%s\n","Course: ", name3);
            System.out.printf("%-20s:%s\n","Year level: ", year);
            
            System.out.println(" ");

            System.out.println("\n =======EDUCATIONAL INFO======= \n");
            
            System.out.printf("%-20s:%s\n","NAME OF SCHOOL: ", name5);
            System.out.printf("%-20s:%s\n","YEAR: ", lv);
            
             
             sc.close();
    }
}
