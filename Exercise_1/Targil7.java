import java.util.Scanner;
public class Targil7 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String x = scanner.nextLine();
		System.out.println("Enter your programming language:");
		String y = scanner.nextLine();
		System.out.println("Hello " + x +", you are writing " + y);
		scanner.close();

	}
}