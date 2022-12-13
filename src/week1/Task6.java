package week1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int c = console.nextInt();
        int r = console.nextInt();
        int t = console.nextInt();

        double result = c * r * (100. - t) / 100;
        System.out.println("Доход: " + result);

    }
}
