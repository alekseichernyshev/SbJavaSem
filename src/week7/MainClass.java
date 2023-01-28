package week7;

import week7.Task1.Bulb;
import week7.Task2.TempType;
import week7.Task2.Thermometr;
import week7.Task3.Robot;
import week7.Task4.FieldValidator;

public class MainClass {
    public static void main(String[] args) {
        // Task1
//        Bulb lamp = new Bulb();
//        lamp.turnOn();
//        System.out.println("Лампочка включена? : " + lamp.isShine());
//        lamp.turnOff();
//        System.out.println("Лампочка включена? : " + lamp.isShine());


        // Task2
//        Thermometr term = new Thermometr(18.0, TempType.Celsius);
//        System.out.println("C : " + term.getTempCelsius() + " " + "F : " + term.getTempFahrenheit());
//        Thermometr term2 = new Thermometr(130.0, TempType.Fahrenheit);
//        System.out.println("C : " + term2.getTempCelsius() + " " + "F : " + term2.getTempFahrenheit());
    //Task3
//        Robot robot = new Robot();
//        robot.go();
//        robot.go();
//        robot.go();
//        robot.printCoordinates();;
//        robot.turnRight();
//        robot.go();
//        robot.go();
//        robot.turnRight();
//        robot.printCoordinates();
        //Task4
        System.out.println(FieldValidator.validatePhone("5433456787653445"));
        System.out.println(FieldValidator.validateEmail("qwerty@email.com"));
    }

}
