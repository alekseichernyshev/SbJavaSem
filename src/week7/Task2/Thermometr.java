package week7.Task2;

public class Thermometr {
    private double tempCelsius;

    private double tempFahrenheit;

//    public Thermometr(double currentTemp, String tempType){
//        if (tempType. equals("C")){
//            this.tempCelsius = currentTemp;
//            this.tempFahrenheit = convertCelsiusToFahrenheit(currentTemp);
//        }else if (tempType.equals("F")){
//            this.tempFahrenheit = currentTemp;
//            this.tempCelsius = convertFahrenheitToCelsius(currentTemp);
//        }else {
//            System.out.println("ERROR!");
//            throw new UnsupportedOperationException("Пожалуйста, введите корректное значение!");
//        }
//    }
public Thermometr(double currentTemp, TempType tempType){
    if (tempType. equals(TempType.Celsius)){
        this.tempCelsius = currentTemp;
        this.tempFahrenheit = convertCelsiusToFahrenheit(currentTemp);
    }else if (tempType.equals(TempType.Fahrenheit)){
        this.tempFahrenheit = currentTemp;
        this.tempCelsius = convertFahrenheitToCelsius(currentTemp);
    }
}

    public double getTempCelsius() {
        return tempCelsius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }
    private double convertCelsiusToFahrenheit(double currentTemp){
       return currentTemp *1.8+32;
    }
    private double convertFahrenheitToCelsius(double currentTemp){
        return (currentTemp-32)/1.8;
    }

//    public enum TempType{
//        Fahrenheit,
//        Celsius
//
//    }
}
