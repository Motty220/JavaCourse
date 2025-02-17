import java.util.Scanner;

public class Targil11 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter for x:");
		int x = scanner.nextInt();
		System.out.println("Enter for y:");
		int y = scanner.nextInt();
		int z = x;
		int a = y;
		x = a;
		y = z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		scanner.close();

	}
}