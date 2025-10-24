package exercise18_Restaurant;

import java.util.HashMap;
import java.util.ArrayList;

public class Restaurant {
    private HashMap<String, Double> menu = new HashMap<>();
    private ArrayList<Integer> ratings = new ArrayList<>();

    public void addItem(String item, double price) {
        menu.put(item, price);
    }

    public void removeItem(String item) {
        menu.remove(item);
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    public void showMenu() {
        System.out.println("Menu: - Restaurant.java:30" + menu);
        System.out.println("Average Rating: - Restaurant.java:31" + getAverageRating());
    }
}
