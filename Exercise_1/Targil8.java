import java.util.Scanner;
public class Targil8 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for n:");
		int n = scanner.nextInt();
		System.out.println("Enter a value for m:");
		int m = scanner.nextInt();
		int z = m + n;
		System.out.println("Sum:" + z);
		System.out.println("Multyiply:" + m * n);
		scanner.close();

	}
}