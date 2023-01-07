package week2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String pattern = console.nextLine();

        System.out.println(str.replace(pattern, pattern.toUpperCase()));
    }
}
