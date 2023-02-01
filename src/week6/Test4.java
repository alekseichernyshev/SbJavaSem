package week6;

public class Test4 {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder buffer = new StringBuilder(s);
        change(buffer);
        System.out.println(buffer);
    }
    private static void change(StringBuilder buffer){
        buffer.append ("и HTML");
    }
}
