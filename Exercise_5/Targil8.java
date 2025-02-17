package Exercise_5;

public class Targil8 {
    public static void main(String[] args) {
        // int counter = 10;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                sum = j * i;
                System.out.print("|");
                if(sum < 10){System.out.print(" ");};
                System.out.print(sum);
            }
        System.out.println();
        }
    }
}
