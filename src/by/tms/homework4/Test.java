package by.tms.homework4;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1, 4);
        Point point2 = new Point(8, 1);
        Rectangle rectangle = new Rectangle();
        System.out.println("Площадь: " + rectangle.getAreaRectangle(point1, point2));
        System.out.println("Диагональ: " + rectangle.getDiagonalRectangle(point1, point2));
        System.out.println("Периметр: " + rectangle.getPerimeterRectangle(point1, point2));
//        апвпвапвап
    }
}
