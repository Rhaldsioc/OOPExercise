package exercise02_Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "Beagle");

        dog1.setName("norry");
        dog1.setBreed("Golden Retriever");

        System.out.println("Dog 1: - DogMain.java:11" + dog1.getName() + " (" + dog1.getBreed() + ")");
        System.out.println("Dog 2: - DogMain.java:12" + dog2.getName() + " (" + dog2.getBreed() + ")");
    }
}
