package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a noumber: ");
        int num = scanner.nextInt();
        int num1 = (num / 100) %10;
        int num2 = (num / 10) %10;
        int num3 = num %10;
        boolean bol1 = (num1 < num2 && num1 < num3);
        boolean bol2 = ((num1 + num2 > 100) || (num1 + num3 > 100) || (num1 + num3 > 100));
        
        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(num3);
        // System.out.println(bol1);
        // System.out.println(bol2);
        System.out.println(bol1 && bol2);

        scanner.close();

    }
}
