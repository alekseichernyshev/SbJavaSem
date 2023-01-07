package week2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        boolean res = (a == -b && a != 0) || (a == -c && a != 0) || (b == -c && b != 0);
        System.out.println(res);
    }
}
