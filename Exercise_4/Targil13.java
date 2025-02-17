package Exercise_4;

import java.util.Scanner;

public class Targil13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number\n> ");
        int num = scanner.nextInt();
        // int j = 0;
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.print("Sum of numbers from 1 to " + num + " is: " + sum);
        scanner.close();
    }
}
