package week1;

import java.util.Scanner;

// перенести числа
public class Task1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        int c = numbers.nextInt();

        System.out.println("a = " + a + " b = " + b + " c + " + c);

        int temp = c;
        c = b;
        b = a;
        a = temp;

        System.out.println("a = " + a + " b = " + b + " c + " + c);

    }
}
