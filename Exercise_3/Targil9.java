package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean 1: ");
        boolean blo1 = scanner.nextBoolean();
        System.out.println("Enter a boolean 2: ");
        boolean blo2 = scanner.nextBoolean();
        blo1 = !blo1;
        blo2 = !blo2;
        System.out.println("For the 1: " + blo1);
        System.out.println("For the 2: " + blo2);
        
        scanner.close();

    }
}
