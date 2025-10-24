package exercise01_Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("elger", 25);
        Person person2 = new Person("norry", 30);

        System.out.println("Person 1: - PersonMain.java:8" + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2:  PersinMain.java:9 - PersonMain.java:9" + person2.getName() + ", Age: " + person2.getAge());
    }
}
