package week6;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10", 2));
        Integer[] intArray = {1, 2, 3};
        int i = intArray[0] + intArray[1];
        int j = i+intArray[2];
        double d = intArray[0];
        System.out.println(i + " " + j + " " + d);
    }
}
