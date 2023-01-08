package week3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        double percent = (console.nextInt() / 100.0);
//        double sum = 1000;
//        int i = 0;
//
//        for (; sum<=1100; sum += sum*percent){
//            i++;
//        }
//        System.out.println("Количество месяцев: " + i);
//        System.out.println("Сумма на счёте: " + sum);

        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        double start = 1000;
        double limit = 1100;
        int month = 0;

        while (start < limit){
            start += start*p/100;
            month++;
        }
        System.out.println(month);
        System.out.println(start);

    }
}
