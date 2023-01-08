package week3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Входные данные n = " + n);
        System.out.println("Выходные данные: ");
        int sum = 0;

        while (n>0){
            sum +=  n % 10;
            System.out.println("Sum in WHILE LOOP: " + sum);

            n = n / 10;
            System.out.println("N in WHILE LOOP: " + n);
        }
        System.out.println("Answer: " + sum);

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int m = scanner.nextInt(); m != 0; m /=10 ){
            total += (m%10);
        }
        System.out.println("Ответ второго способа: " + total);
    }
}
