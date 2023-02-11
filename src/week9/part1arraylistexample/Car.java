package week9.part1arraylistexample;

import java.util.Objects;

public class Car {
    private String carBrand;

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
        return "carBrand='" + carBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carBrand, car.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand);
    }
}
