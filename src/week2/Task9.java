package week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char c = console.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c + ('A' - 'a')));
        } else {
            System.out.println((char) (c - ('A' - 'a')));
        }
    }
}
