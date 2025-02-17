package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a noumber 1: ");
        int num1 = scanner.nextInt();
        System.out.print("enter a noumber 2: ");
        int num2 = scanner.nextInt();
        System.out.print("enter a noumber 3: ");
        int num3 = scanner.nextInt();
        System.out.print("enter a noumber 4: ");
        int num4 = scanner.nextInt();
        System.out.println(num1>0 && num2>0 && num3>0 && num4>0);

        scanner.close();
    }
}
