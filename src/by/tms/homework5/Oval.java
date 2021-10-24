package by.tms.homework5;

import java.util.Objects;

public class Oval extends Circle implements GettingArea {

    private int radius2;

    public Oval(String figureName, int radius, int radius2) {
        super(figureName, radius);
        this.radius2 = radius2;
    }

    @Override
    public double getArea() {
        return getP() * getRadius() * radius2;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius2=" + radius2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oval oval = (Oval) o;
        return radius2 == oval.radius2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius2);
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
