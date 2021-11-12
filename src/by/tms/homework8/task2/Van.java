package by.tms.homework8.task2;

import java.util.Objects;

public class Van extends Car {

    private double capacity;

    public Van(String mark, String model, String color, double weight, int releaseYear, double capacity) {
        super(mark, model, color, weight, releaseYear);
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Van van = (Van) o;
        return Double.compare(van.capacity, capacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return "Van{" +
                "capacity=" + capacity +
                '}';
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
