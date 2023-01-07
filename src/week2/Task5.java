package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

//        if( a % 2 != 0 || b % 2 != 0)
//        {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
        boolean aIsOdd = a % 2 != 0;
        boolean bIsOdd = b % 2 !=0;

        if((aIsOdd && !bIsOdd) || (!aIsOdd && bIsOdd)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
