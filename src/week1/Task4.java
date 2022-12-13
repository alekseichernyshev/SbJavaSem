package week1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double s = console.nextDouble();

        double d = Math.sqrt(s * 4 / Math.PI);
        double l = Math.PI * d;

        System.out.println("Диаметр окружности: " + d);
        System.out.println("Длинна окружности: " + l);

    }
}
