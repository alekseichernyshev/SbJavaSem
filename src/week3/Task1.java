package week3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
            System.out.println("Промежуточный результат: " + result);
        }
        System.out.println("\n Окончательный результат: " + result);
    }
}
