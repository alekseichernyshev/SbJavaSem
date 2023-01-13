package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = console.nextInt();
        }

        int k = console.nextInt();
        int[] arr2 = new int[k];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = console.nextInt();
        }
        mergeTwoArraysWithLoop(arr1, arr2);
        mergeTwoArraysWithSystemArrayCopy(arr1, arr2);
        mergeTwoArrays(arr1, arr2);


    }

    /**
     * метод делает слияние двух отсортированных массивов в третий результатирующий
     *
     * @param arr1 - первый массив
     * @param arr2 - второй массив
     */
    public static void mergeTwoArraysWithLoop(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int element : arr1) {
            mergedArray[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            mergedArray[pos] = element;
            pos++;
        }

        Arrays.sort(mergedArray);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static void mergeTwoArraysWithSystemArrayCopy(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        //обход двух массивов
        while (i<arr1.length && j< arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // сохраняем оставшиеся элементы первого массива
        while (i < arr1.length){
            mergedArray[k++] =arr1[i++];
        }

        // сохраняем оставшиеся элементы второго массива
        while (j < arr2.length){
            mergedArray[k++] =arr1[j++];
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}
