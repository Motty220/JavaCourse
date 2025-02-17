import java.util.Scanner;

public class Targil15 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value for A: ");
		int a = scanner.nextInt();
		System.out.print("Enter value for B: ");
		int b = scanner.nextInt();
		System.out.print("Enter value for C: ");
		int c = scanner.nextInt();
		double dis1 = ((Math.pow(b, 2)) - 4 * a * c);
 		if (dis1 < 0) {
        	    System.out.println("No real solutions"); 
	        } else {
		double dis = Math.sqrt(dis1);
		double sumM = (-b -dis ) / ( 2 * a );
		double sumP = (-b + dis ) / ( 2 * a );
		System.out.println("Solution 1: " + sumM);
		System.out.println("Solution 2: " + sumP);

		}
	scanner.close();

	}
}