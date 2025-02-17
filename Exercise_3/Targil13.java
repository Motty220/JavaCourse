import java.util.Scanner;

public class Targil13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a nounber 1: ");
        Float num1 = scanner.nextFloat();
        System.out.println("Enter a nounber 2: ");
        Float num2 = scanner.nextFloat();
        System.out.println("Enter a nounber 3: ");
        Float num3 = scanner.nextFloat();
        System.out.println("Chose one: \n[1]For '+' \n[2]For '*'\n[3]For highest num\n[4]For des");
        int num4 = scanner.nextInt();

        switch (num4) {
            case 1:
                System.out.println(num1 + num2 + num3);
                break;
            case 2:
                System.out.println(num1 * num2 * num3);
                break;
            case 3:
                Float max = (float)0.0;
                for(int e = 1; e < 11; e++){
                    max = Math.max(num1, max);
                    max = Math.max(num2, max);
                    max = Math.max(num3, max);
                    System.out.println(max);
                    //System.out.printf(%2f, max);
                }
                break;
            case 4:
                System.out.println((num1 + num2 +num3)/3);
                break;
            default:
                System.out.println("It is not a corect noumber");
                break;
        }
        scanner.close();
    }
}
