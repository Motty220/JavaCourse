import java.text.DecimalFormat;
import java.util.Scanner;
public class Targil14 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0000");
		System.out.println("Enter radius:");
		Float  x = scanner.nextFloat();
		double y = (2 * x) * Math.PI;
		double z = (x * x) * Math.PI;
		System.out.println("area: " + df.format(y));
		System.out.println("Circumferenc: " + df.format(z));
		scanner.close();

	}
}