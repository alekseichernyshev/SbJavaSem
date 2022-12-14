package week2;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        final String rubleSignature = " rub.";
        Scanner console = new Scanner(System.in);

        int roomType = console.nextInt();

        switch (roomType){
            case 1:
                System.out.println("Vip " + 12500 + rubleSignature);
                break;
            case 2:
                System.out.println("Premium " + 9000 + rubleSignature);
                break;
                case 3:
                    System.out.println("Standard " + 6300 + rubleSignature);
                    break;
            case 4:
                System.out.println("Economy " + 3800 + rubleSignature);
                break;
            default:
                System.out.println("Неизвестный тип номера! Пожалуйста введите допустимое значение от 1 до четырёх.");
        }



    }
}
