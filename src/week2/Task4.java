package week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        if (i == 1) {
            System.out.println("VIP 12 500 рублей");
        }
        if (i == 2) {
            System.out.println("Premium 9 000 рублей");
        }
        if (i == 3) {
            System.out.println("Standard 6 300 рублей");
        }
        if (i == 4) {
            System.out.println("Economy 3 800 рублей");
        }
    }
}
