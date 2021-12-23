package by.tms.homework16JDBC;


public class Main {

    public static void main(String[] args) {
        RestaurantDao restaurantDao = new RestaurantDao();
        Restaurant restaurant = new Restaurant("Meat-eater");
        Restaurant restaurant1 = new Restaurant("Big");
        Restaurant restaurant2 = new Restaurant("Small");
        Restaurant restaurant3 = new Restaurant("Middle");

        System.out.println(restaurantDao.saveRestaurant(restaurant));
        System.out.println(restaurantDao.saveRestaurant(restaurant1));
        System.out.println(restaurantDao.saveRestaurant(restaurant2));
        System.out.println(restaurantDao.saveRestaurant(restaurant3));

        ReviewDao reviewDao = new ReviewDao();

        Review review = new Review("Bad", restaurant);
        Review review1 = new Review("Good", restaurant1);
        Review review2 = new Review("Nice", restaurant2);
        Review review3 = new Review("Better", restaurant3);

        System.out.println(reviewDao.saveReview(review));
        System.out.println(reviewDao.saveReview(review1));
        System.out.println(reviewDao.saveReview(review2));
        System.out.println(reviewDao.saveReview(review3));

        DishDao dishDao = new DishDao();

        Dish dish = new Dish("Fish");
        Dish dish1 = new Dish("Meat");
        Dish dish2 = new Dish("Fruit");
        Dish dish3 = new Dish("Vegetables");
        Dish dish4 = new Dish("Bol");
        Dish dish5 = new Dish("Foot");
        Dish dish6 = new Dish("Hand");
        Dish dish7 = new Dish("Neck");

        System.out.println(dishDao.saveDish(restaurant, dish));
        System.out.println(dishDao.saveDish(restaurant, dish1));
        System.out.println(dishDao.saveDish(restaurant1, dish2));
        System.out.println(dishDao.saveDish(restaurant1, dish3));
        System.out.println(dishDao.saveDish(restaurant2, dish4));
        System.out.println(dishDao.saveDish(restaurant2, dish5));
        System.out.println(dishDao.saveDish(restaurant3, dish6));
        System.out.println(dishDao.saveDish(restaurant3, dish7));

        System.out.println(restaurantDao.getRestaurantDishesAndReviews(restaurant));
        System.out.println(restaurantDao.getRestaurantDishesAndReviews(restaurant1));
        System.out.println(restaurantDao.getRestaurantDishesAndReviews(restaurant2));
        System.out.println(restaurantDao.getRestaurantDishesAndReviews(restaurant3));

        System.out.println("Ресторан: " + restaurant + "Меню: " + restaurant.getMenu() + "Отзывы: " + restaurant.getReviews());
        System.out.println("Ресторан: " + restaurant1 + "Меню: " + restaurant1.getMenu() + "Отзывы: " + restaurant1.getReviews());
        System.out.println("Ресторан: " + restaurant2 + "Меню: " + restaurant2.getMenu() + "Отзывы: " + restaurant2.getReviews());
        System.out.println("Ресторан: " + restaurant3 + "Меню: " + restaurant3.getMenu() + "Отзывы: " + restaurant3.getReviews());

    }
}
