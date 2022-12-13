package week1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        double y = console.nextDouble();

        System.out.println(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));

    }
}
