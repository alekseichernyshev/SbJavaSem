package week5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
                flag = true;
            }
            if (!flag) {
                System.out.println("-1");
            }
        }
    }
}

