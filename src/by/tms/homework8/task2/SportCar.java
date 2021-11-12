package by.tms.homework8.task2;

import java.util.Objects;

public class SportCar extends Car {

    private double maxSpeed;

    public SportCar(String mark, String model, String color, double weight, int releaseYear, double maxSpeed) {
        super(mark, model, color, weight, releaseYear);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar sportCar = (SportCar) o;
        return Double.compare(sportCar.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
