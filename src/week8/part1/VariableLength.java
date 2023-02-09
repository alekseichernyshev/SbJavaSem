package week8.part1;

public class VariableLength {

    static int sum(int ... numbers){
        int sum = 0;
        for (int i = 0; i< numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }

    static boolean findChar(Character ch, String ... strings){
        for (int i = 0; i< strings.length; i++){
            if(strings[i].indexOf(ch) != -1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String message = "This is an integer: %d";

        System.out.println(sum(1,3,4));
        System.out.println(sum(1,2));

        System.out.println(findChar('a', "python", "java"));
        System.out.println(findChar('q', "python", "java" ));

        System.out.println(String.format(message, 123));

    }
}
