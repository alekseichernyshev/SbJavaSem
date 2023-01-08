package week3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();

        for (int i = 0; i<=n; i++){
            System.out.println((int)Math.pow(m,i));
        }
    }
}
