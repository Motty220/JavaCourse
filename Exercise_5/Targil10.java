package Exercise_5;

import java.util.Scanner;

public class Targil10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n.\n> ");
        int n = scanner.nextInt();
        System.out.print("Enter m.\n> ");
        int m = scanner.nextInt();
        while (n > m) {
            System.out.print("Enter m larger than " + m + "\n> ");
            m = scanner.nextInt();
        }
        
        for (int i = n; i <= m; i++) {
            int h = i, y = 0, sum = 0; 
            while (h > 0 || sum > 9) {
                y = h % 10;
                h /= 10;
                sum += y;
                if (h <= 0  && sum > 9){
                    h = sum;
                    sum = 0;
                };
            }
            System.out.println("" + i + " = " + sum);
        }
        scanner.close();
    }
}