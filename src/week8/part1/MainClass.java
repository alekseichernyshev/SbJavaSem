package week8.part1;

public class MainClass {
    public static void main(String[] args) {
        //Task1
        //System.out.println(WeekDays.MONDAY);

        String name = "среда";
        System.out.println("Порядковый номер дня недели: " + name + " = " + WeekDays.ofName(name).getDayNumber());
        int number = 7;
        System.out.println("Порядковый номер дня недели: " + number + " = " + WeekDays.ofNumber(number).getName());

    }
}
