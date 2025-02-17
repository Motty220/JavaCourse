package Exercise_4;

import java.util.Scanner;

public class Targil14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number\n>");
        String num = scanner.nextLine();
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)%2 == 0){
                System.out.print(num.charAt(i) + " ");
            }
        }
        scanner.close();
    }
}
