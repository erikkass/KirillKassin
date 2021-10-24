package by.tms.homework5;

public class ShapeUtils {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник", 10, 5);
        System.out.println(isRectangle(rectangle));

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Равносторонний треугольник", 6, 6, 6);
        System.out.println(isEquilateralTriangle(equilateralTriangle));
    }

    public static boolean isRectangle(Rectangle rectangle) {
        if (rectangle.getSide() != rectangle.getSide2()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEquilateralTriangle(EquilateralTriangle equilateralTriangle) {
        if (equilateralTriangle.getSide() == equilateralTriangle.getSide2() && equilateralTriangle.getSide2() == equilateralTriangle.getSide3()) {
            return true;
        } else {
            return false;
        }

    }

}
