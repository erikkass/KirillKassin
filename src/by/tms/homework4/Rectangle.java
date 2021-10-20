package by.tms.homework4;

public class Rectangle {
    Point pointUpperLeftCorner;
    Point pointLowerRightCorner;

    Rectangle(Point pointUpperLeftCorner, Point pointLowerRightCorner) {
        this.pointUpperLeftCorner = pointUpperLeftCorner;
        this.pointLowerRightCorner = pointLowerRightCorner;

    }

    Rectangle() {
        System.out.println("Точки не заданы");

    }


    public double getDiagonalRectangle() {
        return Math.sqrt((pointLowerRightCorner.x - pointUpperLeftCorner.x) * (pointLowerRightCorner.x - pointUpperLeftCorner.x) - (pointUpperLeftCorner.y - pointLowerRightCorner.y) * (pointUpperLeftCorner.y - pointLowerRightCorner.y));
    }

    public double getAreaRectangle() {
        return (pointLowerRightCorner.x - pointUpperLeftCorner.x) * (pointUpperLeftCorner.y - pointLowerRightCorner.y);
    }

    public double getPerimeterRectangle() {
        return ((pointLowerRightCorner.x - pointUpperLeftCorner.x) * 2) + ((pointUpperLeftCorner.y - pointLowerRightCorner.y) * 2);
    }

}

