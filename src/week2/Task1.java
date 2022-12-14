package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String str;
        if(n % 2 == 0){
            str = "число чётное";
        }
        else {
            str = "Число не чётное";
        }

        String str2 = (n % 2 == 0) ? "Число чётное":"число не чётное";

        System.out.println(str2);

    }
}
