package creational.builder;

public class Program {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
