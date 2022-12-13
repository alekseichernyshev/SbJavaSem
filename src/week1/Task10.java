package week1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double gallonToLitre = 0.219969;
        int litre = console.nextInt();

        System.out.println("Введено: " + litre +" литров, это - " + litre * gallonToLitre + " галлонов.");

    }
}
