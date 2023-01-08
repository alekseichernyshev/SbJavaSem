package week3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = 1;

        for (int i = m; i <= n; i++){
            result *=i;
        }
        System.out.println(result);
    }
}
