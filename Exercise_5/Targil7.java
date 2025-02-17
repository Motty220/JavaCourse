package Exercise_5;

import java.util.Scanner;

public class Targil7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number\n> ");
        int size = scanner.nextInt();
        int e = size * 2;
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print("**");
            }
            for (int l = e; l > 1; l--) {
                System.out.print("  ");
            }
            for (int y = 1; y < i; y++) {
                System.out.print("**");
            }
            System.out.print("*");
        e -= 2;
        System.out.println();
        }
    scanner.close();
    }
}
