package Exercise_4;

import java.util.Scanner;

public class Targil16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an element in the series.\n>");
        int num = scanner.nextInt();
        int num1 = 0, num2 = 1, sum = 0;
        if (num >= 1){System.out.print("0 ");}
        if (num >= 2){System.out.print("1 ");}
        for (int i = 1; i < num; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
        scanner.close();
    }
}
