package week5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        String[]arr = new String[n];

        for (int i = 0; i<n; i++){
            arr[i] = console.next();
        }
        int m = console.nextInt();
        int k = 0;
        String[] result = new String[n];

        for (String s: arr) {
            if(s.length() <= m){
                result[k++] = s;
            }
        }
        for (int i = 0; i<k; i++){
            System.out.print(result[i] + " ");
        }
    }
}
