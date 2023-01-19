package week6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int[][] array = new int[number][number];

        for (int i = 0; i<number; i++){
            for (int j = 0; j<number; j++){
                if ((i + j)%2 == 0){
                    array[i][j] = 0;
                }else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i<number; i++){
            for (int j = 0; j<number;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
