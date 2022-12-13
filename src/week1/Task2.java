package week1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int c = console.nextInt();

        if (m > 0 && m < 100) {
            System.out.println((double) c / m);
        } else {
            System.out.println("Вы ввели не верные значения");
        }
    }
}
