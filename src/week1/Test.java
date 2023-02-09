package week1;

public class Test {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int x = 100;
        for (int i = 0; i< test.length-1; i++){
            test[i] = test[i+1];
            test[test.length-1] = x;
        }
        for (int i = 0; i< test.length-1; i++){
            System.out.print(test[i] + " ");
        }
    }
}
