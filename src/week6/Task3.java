package week6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n;j++){
                array[i][j] = console.nextInt();
            }
        }

        int p = console.nextInt();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n;j++){
                if (array[i][j] == p){
                    fillWithZero(array, n, i, j, p);
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

    public static void fillWithZero(int[][] array, int n, int iIndex, int jIndex, int p){
        for (int k = 0; k<n; k++){
            System.out.println("array[k][jIndex]" + array[k][jIndex]);
            if (array[k][jIndex] !=p){
                array[k][jIndex] = 0;
            }
            if (array[iIndex][k] !=p){
                array[iIndex][k] = 0;
            }
        }
        System.out.println("------------------------------------------------------");
    }

}
