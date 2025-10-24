package exercise08_TrafficLight;

public class TrafficLight {
    private String color;
    private int duration; // in seconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public void showStatus() {
        System.out.println("Traffic Light: - TrafficLight.java:25" + color + " for " + duration + " seconds");
    }
}
