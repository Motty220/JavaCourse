package Exercise_4;

import java.util.Scanner;

public class Targil8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noumber: ");
        int noumber = scanner.nextInt();
        while (noumber > 0) {
            System.out.println(noumber);
            noumber--;
        }
    scanner.close();
    }
}
