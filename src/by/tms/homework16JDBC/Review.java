package by.tms.homework16JDBC;

public class Review {

    private int id;
    private String text;
    private Restaurant restaurant;

    public Review(String text, Restaurant restaurant) {
        this.text = text;
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
