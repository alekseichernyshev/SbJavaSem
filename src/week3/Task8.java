package week3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int result = 0;

        for ( int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                result++;
            }
        }
        System.out.println(result);
    }
}
