package by.tms.homework8.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Garage {

    Map<Car, Integer> carGarage = new HashMap<>();
    private Integer value = 1;

    public void parkingCar(Car car) {
        carGarage.put(car, quantityCars(car));
        System.out.println(car.getMark() + " припаркован.");
    }

    public void departureCar(Car car) {
        carGarage.remove(car);
        value = 0;
        for (Map.Entry entry : carGarage.entrySet()) {
            if (entry.getKey().getClass().equals(car.getClass())) {
                value++;
            }
        }
        for (Map.Entry entry1 : carGarage.entrySet()) {
            if (entry1.getKey().getClass().equals(car.getClass())) {
                entry1.setValue(value);
            }
        }

        System.out.println(car.getMark() + " выехал.");
    }

    public int quantityCars(Car car) {
        value = 1;
        for (Map.Entry entry : carGarage.entrySet()) {
            if (entry.getKey().getClass().equals(car.getClass())) {
                value++;
            }
            for (Map.Entry entry1 : carGarage.entrySet()) {
                if (entry1.getKey().getClass().equals(car.getClass())) {
                    entry1.setValue(value);
                }
            }
        }
        return value;
    }

    public Map<Car, Integer> getCarGarage() {
        return carGarage;
    }

    public void setCarGarage(Map<Car, Integer> carGarage) {
        this.carGarage = carGarage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return carGarage.equals(garage.carGarage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carGarage);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carGarage=" + carGarage +
                '}';
    }
}
