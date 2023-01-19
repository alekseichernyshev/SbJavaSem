package week6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n;j++){
                array[i][j] = console.nextInt();
            }
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n;j++){
                if (i == j){
                    array[i][j] =0;
                }else {
                    array[j][i] = array[i][j];
                }
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
