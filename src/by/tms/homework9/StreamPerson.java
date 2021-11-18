package by.tms.homework9;

import java.util.*;

public class StreamPerson {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alex", "Doe", 30),
                new Person("John", "Wick", 25),
                new Person("Arnold", "Schwarzenegger", 42),
                new Person("Denzel", "Washington", 21),
                new Person("Al", "Pacino", 41)));

        Optional<String> first = people.stream()
                .filter(p -> p.getFirstName().length() + p.getLastName().length() <= 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst();
        System.out.println(first.get());
        if(first.isPresent()){
            String person = first.get();
        }
    }
}
