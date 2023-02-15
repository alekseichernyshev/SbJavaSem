package week9.part1arraylistexample;

import java.util.Objects;

public class Car {
    private String carBrand;
    private int yearOfManufacture;

    public Car(String carBrand, int yearOfManufacture) {
        this.carBrand = carBrand;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(String carBrand){
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(carBrand, car.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, yearOfManufacture);
    }
}
