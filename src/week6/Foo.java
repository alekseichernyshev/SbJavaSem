package week6;

public class Foo {
    int i;
    static int s;

    public static void main(String[] args) {
        Foo f1 = new Foo();
        System.out.println("F1.i  " + f1.i + " f1.s" + f1.s);
        Foo f2 = new Foo();
        System.out.println("F2.i " + f2.i + " f2.s" + f2.s);
        Foo f3 = new Foo();
        System.out.println("F3.i " + f3.i + " f3.s" + f3.s);

    }
    public Foo(){
        i++;
        s++;
    }
}
