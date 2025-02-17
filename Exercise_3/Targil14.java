import java.util.Scanner;

public class Targil14 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your ID: ");
    String Str = scanner.nextLine();
    int sum = 0;
    int ID4 = 0;
    int ID5 = 0;
    while (Str.length() < 9) {
        Str = "0" + Str;
    }
    for(int j = 1;j < 9;j+=2){
        ID5 = ((Str.charAt(j))-'0')*2;
        if(ID5 > 9){
            int ID1 = ID5 % 10;
            int ID2 = ID5 / 10;
            ID5 = ID1 + ID2;
        }
        sum += ID5;
    }
    for(int e = 0;e < 9;e+=2){
        ID4 = ((Str.charAt(e))-'0')*1;
        if(ID4 > 9){
            int ID1 = ID4 % 10;
            int ID2 = ID4 / 10;
            ID4 = ID1 + ID2;
        }
        sum += ID4;
    }
    System.out.print("The ID is " + ((sum%10) == 0));
    scanner.close();
    }   
}

