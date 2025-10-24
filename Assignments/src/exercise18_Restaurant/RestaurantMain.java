package exercise18_Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.addItem("Burger", 150);
        rest.addItem("Pizza", 300);
        rest.addRating(4);
        rest.addRating(5);

        rest.showMenu();
    }
}
