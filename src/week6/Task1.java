package week6;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = console.nextInt();
            }
        }
        int[] res = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i] += array[j][i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
