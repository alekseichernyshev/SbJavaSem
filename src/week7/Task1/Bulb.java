package week7.Task1;

public class Bulb {
    private boolean toggle;

    public Bulb(){}

    // включить лампу
    public void turnOn(){
        this.toggle = true;
    }

    // выключить лампу
    public void turnOff(){
        this.toggle = false;
    }

    // метод проверки состояния лампы
    public boolean isShine(){
        return this.toggle;
    }
}
