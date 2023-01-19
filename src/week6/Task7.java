package week6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int result = 1;

        for (int i = 1; i<=n; i++){
            result=result * i;
        }
        System.out.println("Factorial (FOR LOOP): " + result);
        System.out.println("Factorial (FOR RECOURSION): " + Factorial(n));
    }

    public static int Factorial(int n){
        if(n<=1){
            return 1;
        }else {
            return n * Factorial(n-1);
        }
    }
}
