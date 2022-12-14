package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        if(x % 2 == 0){
            if(x >= 0){
                System.out.println("число чётное и больше или равно нолю");
            }
            else{
                System.out.println("число чётное и меньше ноля");
            }
        }
        else {
            System.out.println("Вы ввели не верное число");
        }




    }
}
