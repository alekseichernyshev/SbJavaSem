package week9.part1arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortOperation {
    public static void main(String[] args) {
        ArrayList<Car> carsWithYear = new ArrayList<>();
        carsWithYear.add(new Car("Toyota", 2023));
        carsWithYear.add(new Car("BMW", 2010));
        carsWithYear.add(new Car("Volvo", 2020));

        System.out.println(carsWithYear);

        carsWithYear.sort(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getCarBrand().compareTo(car2.getCarBrand());
            }
        });

        Collections.sort(carsWithYear, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.getYearOfManufacture(), car2.getYearOfManufacture());
            }
        });
        System.out.println(carsWithYear);
    }
}
