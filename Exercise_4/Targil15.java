package Exercise_4;

import java.util.Scanner;

public class Targil15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number\n> ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
              sum += i;  
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num + " isn't a perfect number");
        }
        scanner.close();
    }
}
