import java.util.Scanner;

public class ID_genritor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String word = "";
    String Str = "";

    while (!word.equals("Exit")){
    Str = "" + (int)(Math.random() * 100000000);
    while (Str.length() < 8) {
        Str = "0" + Str;
    }
    int sum = 0;

    for(int j = 1;j < 8;j+=2){
        int ID5 = ((Str.charAt(j))-'0')*2;
        if(ID5 > 9){
            ID5 = (ID5 % 10) + (ID5 / 10);
        }
        sum += ID5;
    }
    for(int e = 0;e < 8;e+=2){
        int ID4 = ((Str.charAt(e))-'0')*1;
        if(ID4 > 9){
            ID4 = (ID4 % 10) + (ID4 / 10);
        }
        sum += ID4;
    }
    int checkDigit = 10 - (sum % 10);
    if (checkDigit == 10) checkDigit = 0;
    sum += checkDigit;
    Str = Str + checkDigit;
    
    System.out.println(Str);
   
    System.out.println("The ID is " + ((sum%10) == 0));
    System.out.print("Enter 'Exit' to stop or press Enter to generate another ID: ");
    word = scanner.nextLine();

}
    scanner.close();
    }
}
