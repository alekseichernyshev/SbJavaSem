package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = console.nextInt();
        }

        // решение через цикл
        int temp = arr[0];
        for (int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));

        // читерское решение
        int first = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
