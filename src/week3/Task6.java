package week3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int fib0 = 0;
        int fib1 = 1;

        if(n == 0){
            System.out.println(fib0);
            System.exit(0);
        }

        if(n == 1)
        {
            System.out.println(fib1);
            return;
        }

        int fibResult = 0;
        for (int i = 2; i <= n; i++)
        {
            fibResult = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibResult;
        }
        System.out.println(fibResult);

    }
}
