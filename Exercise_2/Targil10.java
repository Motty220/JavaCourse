import java.util.Scanner;
public class Targil10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seven letters: ");
        String sc = scanner.nextLine();

        for (int i = 0; i < sc.length(); i++) {
            System.out.print("" + sc.charAt(i) + " ");
            
	if (i == 3) {
		System.out.println();
				System.out.print(" ");
			} else if (i == 5) {
                System.out.println();
		System.out.print("  ");
            }
        }
    scanner.close();
    }
}
