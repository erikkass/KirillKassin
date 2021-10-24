package by.tms.homework5;

import java.util.Objects;

public class Circle extends Figure implements GettingArea {

    private int radius;
    private static final double P = 3.14;

    public Circle(String figureName, int radius) {
        super(figureName);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return P * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Double.compare(circle.P, P) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, P);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", P=" + P +
                '}';
    }

    public double getP() {
        return P;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
