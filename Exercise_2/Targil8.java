import java.util.Scanner;
public class Targil8{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value: ");
		String str = scanner.nextLine();
		int chr1 = str.charAt(0);
		int chr2 = str.charAt(1);
		int chr3 = str.charAt(2);
		System.out.println(chr2);
		System.out.println(chr3);
		int sum = (chr3 + chr2 + chr1)/3;
		System.out.println("The average of: " + str.charAt(0) + " + " + str.charAt(1) + " + " + str.charAt(2) + " = " + sum );
		scanner.close();

	}
}
