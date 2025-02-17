package Exercise_5;

import java.util.Scanner;

public class Targil5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number\n> ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
        }
    scanner.close();
    }
}
