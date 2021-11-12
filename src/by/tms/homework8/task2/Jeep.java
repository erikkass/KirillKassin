package by.tms.homework8.task2;

import java.util.Objects;

public class Jeep extends Car {

    private double clearance;

    public Jeep(String mark, String model, String color, double weight, int releaseYear, double clearance) {
        super(mark, model, color, weight, releaseYear);
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "clearance=" + clearance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jeep jeep = (Jeep) o;
        return Double.compare(jeep.clearance, clearance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clearance);
    }

    public double getClearance() {
        return clearance;
    }

    public void setClearance(double clearance) {
        this.clearance = clearance;
    }
}
