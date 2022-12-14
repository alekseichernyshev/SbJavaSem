package week2;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = x > 0 ? x < 100 ? 1 : 0 : -1;
        System.out.println(y);

    }
}
