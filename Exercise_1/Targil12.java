import java.util.Scanner;
public class Targil12 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter for x:");
		int x = scanner.nextInt();
		System.out.println("Enter for y:");
		int y = scanner.nextInt();
		x = x+y;
		y = x-y;
		x = (y-x)*(-1);
		System.out.println("x= " + x);
		System.out.println("y= " +  y);
		scanner.close();

	}
}