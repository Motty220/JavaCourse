package Exercise_4;

import java.util.Scanner;

public class Targil9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noumber < 100: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; sum < 100; i++) {
            sum = num * i;
            if (sum >= 100){break;}
            System.out.println(sum);
        }
    scanner.close();
    }
}
