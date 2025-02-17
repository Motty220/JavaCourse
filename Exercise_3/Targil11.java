package Exercises.Exercise_3;

import java.util.Scanner;

public class Targil11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a noumber X:");
        int numX = scanner.nextInt();
        System.out.println("Enter a noumber Y:");
        int numY = scanner.nextInt();
        System.out.println("Enter a noumber Z:");
        int numZ = scanner.nextInt();
        
        
        if (numX < numY && numY < numZ){System.out.println("" + numX + "  " + numY + "  " + numZ);};
        if (numX > numY && numY > numZ){System.out.println("" + numZ + "  " + numY + "  " + numX);};
        if (numX < numY && numY > numZ){System.out.println("" + numX + "  " + numZ + "  " + numY);};
        if (numX > numY && numY < numZ){System.out.println("" + numY + "  " + numZ + "  " + numX);};
   
          scanner.close();  
        
    }
}
