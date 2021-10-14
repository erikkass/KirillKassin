package by.tms.homework4;

public class Rectangle {
    Point pointUpperLeftCorner = new Point(1, 4);
    Point pointLowerRightCorner = new Point(8, 1);
//    ываыва

    public double getDiagonalRectangle(Point pointLowerRightCorner, Point pointUpperLeftCorner) {
        return Math.sqrt((pointLowerRightCorner.x - pointUpperLeftCorner.x) * (pointLowerRightCorner.x - pointUpperLeftCorner.x) - (pointUpperLeftCorner.y - pointLowerRightCorner.y) * (pointUpperLeftCorner.y - pointLowerRightCorner.y));
    }

    public double getAreaRectangle(Point pointLowerRightCorner, Point pointUpperLeftCorner) {
        return (pointLowerRightCorner.x - pointUpperLeftCorner.x) * (pointUpperLeftCorner.y - pointLowerRightCorner.y);
    }

    public double getPerimeterRectangle(Point pointLowerRightCorner, Point pointUpperLeftCorner) {
        return ((pointLowerRightCorner.x - pointUpperLeftCorner.x) * 2) + ((pointUpperLeftCorner.y - pointLowerRightCorner.y) * 2);
    }

}

