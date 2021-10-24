package by.tms.homework5;

import java.util.Objects;

public class EquilateralTriangle extends Figure {

    private int side;
    private int side2;
    private int side3;

    public EquilateralTriangle(String figureName, int side, int side2, int side3) {
        super(figureName);
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getHeight() {
        if (side == side2 && side2 == side3) {
            System.out.println((side * Math.sqrt(3)) / 2);
        } else {
            System.out.println("Данный треугольник не являеться равносторонним!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EquilateralTriangle that = (EquilateralTriangle) o;
        return side == that.side && side2 == that.side2 && side3 == that.side3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, side2, side3);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "side=" + side +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}
