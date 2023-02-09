package week8.part1;

public enum WeekDays {
    MONDAY(1, "понедельник"),
    TUESDAY(2, "вторник"),
    WEDNESDAY(3, "среда"),
    THURSDAY(4, "четверг"),
    FRIDAY(5, "пятницв"),
    SATURDAY(6, "суббота"),
    SUNDAY(7, "воскресенье");

    private final int dayNumber;
    private final String name;

    public int getDayNumber() {
        return dayNumber;
    }

    public String getName() {
        return name;
    }

    WeekDays(int dayNumber, String name){
        this.dayNumber = dayNumber;
        this.name = name;
    }

    public static WeekDays ofNumber(int dayNumber){
        for (WeekDays ownershipType:values()){
            if(ownershipType.dayNumber == dayNumber){
                return ownershipType;
            }
        }
        throw new IllegalArgumentException("Неизвестное значение номера дня недели: " +dayNumber);
    }

    public static WeekDays ofName(String name){
        for (WeekDays ownershipType:values()){
            if(ownershipType.name.equals(name)){
                return ownershipType;
            }
        }
        throw new IllegalArgumentException("Неизвестное значение имени дня недели: " +name);
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "dayNumber=" + dayNumber +
                ", name='" + name + '\'' +
                '}' + super.toString();
    }
}
