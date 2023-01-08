package week3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//        int result = 0;
//        while (true)
//        {
//            if(console.nextInt()<0)
//            {
//                result++;
//            }else break;
//        }
//        System.out.println(result);
    int count = 0;
    for (int i = console.nextInt(); i < 0; i = console.nextInt()){
        count++;
    }
        System.out.println(count);
    }
}
