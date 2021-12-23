package by.tms.homework16JDBC;

import java.sql.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DishDao {

    public static final String DB_URL_KEY = "HomeDB.url";
    public static final String DB_USERNAME_KEY = "HomeDB.username";
    public static final String DB_PASS_KEY = "HomeDB.pass";

    public static final String SQL_SAVE_DISH = "INSERT INTO restaurant_storage.menu (name,restaurant_id) VALUES (?,?)";
    public static final String SQL_GET_DISH = "SELECT id, name, restaurant_id FROM restaurant_storage.menu WHERE restaurant_id = ?";

    public Restaurant saveDish(Restaurant restaurant, Dish dish) {
        Connection connection = null;
        PreparedStatement saveDish = null;
        PreparedStatement setDish = null;
        Set<Dish> menu = new HashSet<>();
        try {
            connection = DriverManager.getConnection(
                    PropertiesManager.getPropertyByKey(DB_URL_KEY),
                    PropertiesManager.getPropertyByKey(DB_USERNAME_KEY),
                    PropertiesManager.getPropertyByKey(DB_PASS_KEY));

            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            saveDish = connection.prepareStatement(SQL_SAVE_DISH);
            saveDish.setString(1, dish.getName());
            saveDish.setInt(2, restaurant.getId());
            setDish = connection.prepareStatement(SQL_GET_DISH);
            saveDish.executeUpdate();
            setDish.setInt(1, restaurant.getId());
            ResultSet resultSet = setDish.executeQuery();
            while (resultSet.next()) {
                Dish dish1 = new Dish(resultSet.getString("name"));
                dish1.setId(resultSet.getInt("id"));
                menu.add(dish1);
                restaurant.setMenu(menu);
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
            if (Objects.nonNull(saveDish)) {
                try {
                    saveDish.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(setDish)) {
                try {
                    setDish.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return restaurant;
    }
}
