package Exercise_5;

public class Targil6_1 {
    public static void main(String[] args) {
        boolean bol = false;
        for (int e = 0; e < 8; e++) {
            for (int j = 0; j < 8; j++) {
                if(bol){System.out.print("   ");
            } else {
                System.out.print("|||");
            }
            bol = !bol ;
        }
    bol = !bol ;
    System.out.println();
    }
}
}