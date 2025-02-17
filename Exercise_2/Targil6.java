import java.util.Scanner;
public class Targil6{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert character: ");
		char input = scanner.next().charAt(0);
		int cr = (int)(input);
		char cr1 = (char)(cr + 1);
		char cr2 = (char)(cr - 1);
		System.out.println("Representation: " + cr);
		System.out.println("Next character: " + cr1);
		System.out.println("Previous character: " + cr2);
        scanner.close();
	}
}