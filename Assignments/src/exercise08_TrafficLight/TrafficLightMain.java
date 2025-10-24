package exercise08_TrafficLight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.showStatus();

        light.changeColor("Green");
        light.showStatus();

        System.out.println("Is Green? - TrafficLightMain.java:11" + light.isGreen());
    }
}
