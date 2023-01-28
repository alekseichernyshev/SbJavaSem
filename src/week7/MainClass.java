package week7;

import week7.Task1.Bulb;

public class MainClass {
    public static void main(String[] args) {
        // Task1
        Bulb lamp = new Bulb();
        lamp.turnOn();
        System.out.println("Лампочка включена? : " + lamp.isShine());
        lamp.turnOff();
        System.out.println("Лампочка включена? : " + lamp.isShine());


    }

}
