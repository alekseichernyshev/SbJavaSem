package week1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        System.out.println(n + 2 - Math.abs(n) % 2);

    }
}
