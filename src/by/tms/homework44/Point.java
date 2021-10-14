package by.tms.homework44;

public class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static double getDistance(Point point1, Point point2) {
        return Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) - (point2.y - point1.y) * (point2.y - point1.y));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;

    }

}
