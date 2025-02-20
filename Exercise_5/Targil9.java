package Exercise_5;

public class Targil9 {
    public static void main(String[] args) {
        
        boolean IsPrime = true;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    IsPrime = false;
                    break;
                }
            }
        if (IsPrime) {
            System.out.print(i + ",");
        }
        IsPrime = true;
        }
    }
}
