package by.tms.homework16JDBC;

import java.sql.*;
import java.util.*;

public class RestaurantDao {

    public static final String DB_URL_KEY = "HomeDB.url";
    public static final String DB_USERNAME_KEY = "HomeDB.username";
    public static final String DB_PASS_KEY = "HomeDB.pass";
    public static final String SQL_SAVE_RESTAURANT = "INSERT INTO restaurant_storage.restaurant (name) VALUES (?)";
    public static final String SQL_GET_ID_RESTAURANT = "SELECT id, name FROM restaurant_storage.restaurant WHERE name = ?";
    public static final String SQL_GET_DISH = "SELECT id, name, restaurant_id FROM restaurant_storage.menu WHERE restaurant_id = ?";
    public static final String SQL_GET_REVIEW = "SELECT id, text FROM restaurant_storage.review WHERE restaurant_id = ?";

    public Restaurant saveRestaurant(Restaurant restaurant) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    PropertiesManager.getPropertyByKey(DB_URL_KEY),
                    PropertiesManager.getPropertyByKey(DB_USERNAME_KEY),
                    PropertiesManager.getPropertyByKey(DB_PASS_KEY));

            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            PreparedStatement saveRestaurant = connection.prepareStatement(SQL_SAVE_RESTAURANT);
            saveRestaurant.setString(1, restaurant.getName());
            saveRestaurant.executeUpdate();
            PreparedStatement getIdRestaurant = connection.prepareStatement(SQL_GET_ID_RESTAURANT);
            getIdRestaurant.setString(1, restaurant.getName());
            ResultSet resultSet = getIdRestaurant.executeQuery();
            if (resultSet.next()) {
                restaurant.setId(resultSet.getInt("id"));
            }
            connection.commit();
            return restaurant;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(connection)) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return restaurant;
    }

    public Restaurant getRestaurantDishesAndReviews(Restaurant restaurant) {
        Connection connection = null;
        PreparedStatement getDish = null;
        PreparedStatement getReview = null;
        Set<Dish> menu = new HashSet<>();
        Set<Review> reviews = new HashSet<>();
        try {
            connection = DriverManager.getConnection(
                    PropertiesManager.getPropertyByKey(DB_URL_KEY),
                    PropertiesManager.getPropertyByKey(DB_USERNAME_KEY),
                    PropertiesManager.getPropertyByKey(DB_PASS_KEY));

            connection.setAutoCommit(false);
            getDish = connection.prepareStatement(SQL_GET_DISH);
            getDish.setInt(1, restaurant.getId());
            ResultSet resultSet = getDish.executeQuery();
            while (resultSet.next()) {
                Dish dish = new Dish(resultSet.getString("name"));
                dish.setId(resultSet.getInt("id"));
                menu.add(dish);
                restaurant.setMenu(menu);
            }
            getReview = connection.prepareStatement(SQL_GET_REVIEW);
            getReview.setInt(1, restaurant.getId());
            ResultSet resultSet1 = getReview.executeQuery();
            while (resultSet1.next()) {
                Review review = new Review(resultSet1.getString("text"), restaurant);
                review.setId(resultSet1.getInt("id"));
                reviews.add(review);
                restaurant.setReviews(reviews);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(connection)) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(getDish)) {
                try {
                    getDish.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(getReview)) {
                try {
                    getReview.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return restaurant;
    }
}
