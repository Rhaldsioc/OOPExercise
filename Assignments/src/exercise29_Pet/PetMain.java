package exercise29_Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 4, "Rubber Bone");
        Bird bird = new Bird("Kiwi", 2, 0.35);

        dog.displayDetails();
        System.out.println();
        bird.displayDetails();
    }
}
