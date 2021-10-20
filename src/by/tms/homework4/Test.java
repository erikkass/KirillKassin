package by.tms.homework4;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 4);
        Point point1 = new Point(8, 1);
        Rectangle rectangle = new Rectangle(point, point1);
        System.out.println("Площадь: " + rectangle.getAreaRectangle());
        System.out.println("Диагональ: " + rectangle.getDiagonalRectangle());
        System.out.println("Периметр: " + rectangle.getPerimeterRectangle());

    }
}
