package week5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
        {
            array[i] = console.nextInt();
        }

        for(int i = 0; i<size; i++)
        {
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        for(int i = 0; i<size; i +=2)
        {
            System.out.println(array[i]);
        }

    }
}
