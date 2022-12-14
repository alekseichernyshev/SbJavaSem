package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n > 999 && n < 10000) {

            int x = n / 1000;
            int x4 = n % 10;

            if (x != x4) {
                System.out.println("не палиндром");
            } else {
                x = (n / 100) % 10;
                x4 = (n % 100) / 10;
            }
            if (x != x4) {
                System.out.println("не палиндром");
            } else {
                System.out.println("Палиндром");
            }

        } else {
            System.out.println("не правильное число");
        }
    }
}
