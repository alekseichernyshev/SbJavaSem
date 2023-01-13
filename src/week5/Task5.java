package week5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }

        int m = console.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == m) {
                    System.out.println(arr[i] + " " + arr[j]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
