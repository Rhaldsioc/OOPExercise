package exercise16_Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: - ShapeMain.java:9" + rect.getArea());
        System.out.println("Circle Area: - ShapeMain.java:10" + circle.getArea());
        System.out.println("Triangle Area: - ShapeMain.java:11" + triangle.getArea());
    }
}
