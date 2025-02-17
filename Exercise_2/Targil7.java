import java.util.Scanner;
public class Targil7{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = scanner.nextLine();
		int it1 = Integer.parseInt(str);
		System.out.print("Enter a another number: ");
		int it2 = scanner.nextInt();
		Boolean bln = it1 == it2; 
		System.out.print("Are the two numbers equal? " + bln);
        scanner.close();

	}
}