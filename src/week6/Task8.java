package week6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(ReverseString(input));
    }

    public static String ReverseString(String str){
        if (str.isEmpty()){
            return str;
        }else {
            return ReverseString(str.substring(1))+ str.charAt(0);
        }
    }
}
