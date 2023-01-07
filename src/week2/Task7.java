package week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int sum;
        if (a <= b && a <= c) {
            sum = b + c;
        } else if (b <= a && b <= c) {
            sum = a + c;
        } else {
            sum = a + b;
        }
        System.out.println(sum);
    }
}
