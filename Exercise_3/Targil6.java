package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Letter: ");
        char Letters = scanner.nextLine().charAt(0);
        switch (Letters) {
            case 'a':
            System.out.println("Excellent");                
                break;
            case 'b': 
            System.out.println("Good");
                break;
            case 'c':
            System.out.println("Average");                
                break;
            case 'd':
            System.out.println("Pass");
                break;
            case 'e':
            System.out.println("Fail");
                break;
            default: 
             System.out.println("No games please! Enter the score.");
        }

        scanner.close();
    }
}
