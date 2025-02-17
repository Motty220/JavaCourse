package Exercise_4;

import java.util.Scanner;

public class Targil10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = 0;
        // while (lines < 1 || lines > 9) {
        //     System.out.print("Enter a number (1-9)\n> ");
        //     lines = scanner.nextInt();
        // }

        System.out.print("Enter a number (1-9)\n> ");
            lines = scanner.nextInt();

        int j3 = lines;
        for (int i = 11; i <= lines; i++) {
            for (int j1 = j3; j1 >= 0 ; j1--) {
                System.out.print(" ");
            }
            if(i == 11){System.out.print(" ");};
            int j = 1;
            for (; j < i; j++) {
                System.out.print(j);
            }
            for (int j2 = j; j2 > 0; j2--) {
                System.out.print(j2);
            }
        j3--;
        System.out.println();
        }
        scanner.close();
        }
    }
