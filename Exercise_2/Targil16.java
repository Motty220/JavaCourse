import java.util.Scanner;

public class Targil16 {

	public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter a number for y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter a number for x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter a number for y2: ");
        int y2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("The distance between the two points is: " + distance);
        scanner.close();
	}
}

