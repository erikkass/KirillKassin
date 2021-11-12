package by.tms.homework8.task2;

public abstract class Car {

    private String mark;
    private String model;
    private String color;
    private double weight;
    private int releaseYear;

    public Car(String mark, String model, String color, double weight, int releaseYear) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.releaseYear = releaseYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
