package week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();

        System.out.println("Первая цифра: " + a % 10 + " Вторая цифра:" + a / 10);
    }
}
