package week6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                a[i][j] = console.nextInt();
            }
        }
        int[] result = new int[n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m;j++){
                result[i] +=a[i][j];
            }
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i<n; i++){
            if (result[i]>=max){
                max = result[i];
                index = i;
            }
        }
        System.out.println("Победил участник под номером: " + ++index);
    }
}
