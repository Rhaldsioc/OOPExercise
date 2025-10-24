package exercise29_Pet;

public class Pet {
    protected String name;
    protected String species;
    protected int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: - Pet.java:15" + name + " | Species: " + species + " | Age: " + age);
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public int getAgeInHumanYears() {
        return age * 7;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: - Pet.java:34" + favoriteToy + " | Human Age Equivalent: " + getAgeInHumanYears());
    }
}

class Bird extends Pet {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    public double getAgeInHumanYears() {
        return age * 5.5;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: - Pet.java:53" + wingspan + " m | Human Age Equivalent: " + getAgeInHumanYears());
    }
}
