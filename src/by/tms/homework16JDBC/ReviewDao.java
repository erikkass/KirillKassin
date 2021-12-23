package by.tms.homework16JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class ReviewDao {

    public static final String DB_URL_KEY = "HomeDB.url";
    public static final String DB_USERNAME_KEY = "HomeDB.username";
    public static final String DB_PASS_KEY = "HomeDB.pass";

    public static final String SQL_SAVE_REVIEW = "INSERT INTO restaurant_storage.review (text,restaurant_id) VALUES (?,?)";

    public boolean saveReview(Review review) {
        Connection connection = null;
        PreparedStatement saveReview = null;
        try {
            connection = DriverManager.getConnection(
                    PropertiesManager.getPropertyByKey(DB_URL_KEY),
                    PropertiesManager.getPropertyByKey(DB_USERNAME_KEY),
                    PropertiesManager.getPropertyByKey(DB_PASS_KEY));

            saveReview = connection.prepareStatement(SQL_SAVE_REVIEW);
            saveReview.setString(1, review.getText());
            saveReview.setInt(2, review.getRestaurant().getId());
            return saveReview.executeUpdate() == 1;
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
            if (Objects.nonNull(saveReview)) {
                try {
                    saveReview.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
