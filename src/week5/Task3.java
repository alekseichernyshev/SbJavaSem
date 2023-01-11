package week5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];
        boolean result = true;

        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }


        System.out.println(checkIfArrayDeck(array));
    }

    public static boolean checkIfArrayDeck(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++){
            if (inputArray[i] <= inputArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
