package by.tms.homework5;

import java.util.Objects;

public class Rectangle extends Square implements GettingArea {

    private int side2;

    public Rectangle(String figureName, int side, int side2) {
        super(figureName, side);
        this.side2 = side2;
    }


    @Override
    public double getArea() {
        return getSide() * side2;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getSide(), 2) + Math.pow(side2, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return side2 == rectangle.side2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side2=" + side2 +
                '}';
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
