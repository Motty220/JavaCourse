import java.util.Scanner;
public class Targil14 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter temperature in Fahrenheit: ");
	double tempF = scanner.nextDouble();
	double tempC = ((tempF - 32) / 1.8);
	System.out.print("Enter the speed of the wind: ");
	double speedM = scanner.nextDouble();
	double speedK = speedM * 1.60934 ;
	double sum = 13.12 + 0.6215 * tempC - 11.37 * Math.pow(speedK, 0.16) + 0.3965 * tempC * Math.pow(speedK, 0.16);
	System.out.printf("%.2f", sum);
	scanner.close();
	}
}