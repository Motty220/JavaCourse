package Exercise_4;

import java.util.Scanner;

public class Targil12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = -1;
        int max = 0;
        while (num != 0) {
            System.out.print("Enter a number\n> ");
            num = scanner.nextInt();
            max = Math.max(max, num);
        }
        System.out.print("The biggest number you enter: " + max);
        
        scanner.close();
    }
}
