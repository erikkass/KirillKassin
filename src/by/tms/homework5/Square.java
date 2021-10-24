package by.tms.homework5;

import java.util.Objects;

public class Square extends Figure implements GettingArea {

    private int side;

    public Square(String figureName, int side) {
        super(figureName);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }


    public double getDiagonal() {
        return side * Math.sqrt(2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
