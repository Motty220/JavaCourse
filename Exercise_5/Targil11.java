package Exercise_5;

public class Targil11 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
                int y = 0, h = i, sum = 0;
                while (h > 0) {
                    y = h % 10;
                    h = h / 10;
                    // counter++;
                    sum += Math.pow(y, 3);
                }
                if(i == sum)System.out.println(i);
            }
        }
    }

