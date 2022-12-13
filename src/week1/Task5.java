package week1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " b = " + b);

    }
}
