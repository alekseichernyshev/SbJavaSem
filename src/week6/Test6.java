package week6;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();

        int[][] a = new int[n][m];
        Random random = new Random();

        for (int i = 0; i<n;i++){
            for (int j = 0; j<m;j++){
                a[i][j] = random.nextInt(2);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        boolean answer = false;

        for (int i = 0; i<n; i++){
            if (!answer){
                for (int j =0; j<m-1; j++){
                    if (a[i][j] == 0 && a[i][j+1] ==0){
                        answer = true;
                        break;

                    }
                }
            }else {
                System.out.println(answer);
                break;
            }
        }
    }
}
