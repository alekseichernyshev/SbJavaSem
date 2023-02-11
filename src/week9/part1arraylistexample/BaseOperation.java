package week9.part1arraylistexample;

import java.util.ArrayList;

public class BaseOperation {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Toyota"));
        System.out.println("Машины в списке: ");
        for (Car car:cars) {
            System.out.println(car.getCarBrand());

        }
        System.out.println();

        cars.forEach(car -> {
            System.out.println(car.getCarBrand());
        });

        cars.remove(cars.size()-1);
        cars.forEach(car -> System.out.println(car.getCarBrand()));

        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains((new Car("BMW"))));

        Car bmw = cars.get(0);
        System.out.println(cars.contains(bmw));

        Car audi = new Car("Audi");
        cars.add(audi);



    }
}
