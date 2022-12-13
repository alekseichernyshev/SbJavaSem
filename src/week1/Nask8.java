package week1;

import java.util.Scanner;

public class Nask8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество детей: ");
        int n = console.nextInt();
        System.out.println("Введите количество конфет: ");
        int k = console.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Всего раздали конфет:" + k / n * n + "шт");
        System.out.println("Каждому ребёнку по:" + k / n + "шт");
        System.out.println("Осталось конфет для взрослых:" + k % n + "шт");

    }
}
