package by.tms.homework8.task2;

import java.util.Objects;

public class Truck extends Car {

    private double loadСapacity;

    public Truck(String mark, String model, String color, double weight, int releaseYear, double loadСapacity) {
        super(mark, model, color, weight, releaseYear);
        this.loadСapacity = loadСapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.loadСapacity, loadСapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadСapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadСapacity=" + loadСapacity +
                '}';
    }

    public double getLoadСapacity() {
        return loadСapacity;
    }

    public void setLoadСapacity(double loadСapacity) {
        this.loadСapacity = loadСapacity;
    }
}
