package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = scanner.nextLine();
        boolean num = (Integer.parseInt(number)%2 == 0);
        if(num) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        scanner.close();
    }    
}
