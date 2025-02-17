package Exercise_4;

import java.util.Scanner;

public class Targil11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (!word.equals("Exit")) {
            System.out.print("Enter a word \n> ");
            word = scanner.nextLine();
            if (word.equals("Exit")){
                System.out.print("Program is exiting");
                break;}
            System.out.println(word);
        }
    scanner.close();
    }
}
