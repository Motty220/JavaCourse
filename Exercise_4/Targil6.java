package Exercise_4;

import java.util.Scanner;

public class Targil6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = scanner.nextLine();
        int i = 0;

        while (i < word.length()) {
            System.out.println(word.charAt(i));
            i++;
        }

        // for (int i = 0;i < word.length(); i++){
        //     System.out.println(word.charAt(i));
        // }
    scanner.close();
    }
}