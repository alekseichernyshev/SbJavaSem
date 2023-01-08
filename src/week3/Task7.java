package week3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();

        int firstMax = Math.max(firstNumber, secondNumber);
        int secondMax = Math.max(firstNumber, secondNumber);

        for (int i = 2; i < n; i++)
        {
            int k = console.nextInt();
            if(k > firstMax)
            {
                secondMax = firstMax;
                firstMax = k;
            }else if(k > secondMax)
            {
                secondMax = k;
            }
        }
        System.out.println(firstMax + " " + secondMax);

    }
}
