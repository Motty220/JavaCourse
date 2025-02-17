package Exercise_4;

import java.util.Scanner;

public class Targil7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noumber: ");
        int noumber = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println((int)Math.pow(noumber, i));
        }
    scanner.close();
    }
}
