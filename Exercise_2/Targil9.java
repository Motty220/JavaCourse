import java.util.Scanner;
public class Targil9{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 3-digit number: ");
		int input = scanner.nextInt();	
		int num1 = input / 100;
		int num2 = ((input /10) %10);
		int num3 = input %10;
		System.out.println("The sum is: " + (num1 - num2 + num3));
		scanner.close();

	}
}