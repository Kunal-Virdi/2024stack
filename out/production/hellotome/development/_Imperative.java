package development;

import java.util.ArrayList;
import java.util.List;

import static development._Imperative.Person.Gender.Female;
import static development._Imperative.Person.Gender.Male;

public class _Imperative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Male),
                new Person("Maria", Female),
                new Person("Alisha", Female),
                new Person("Alex", Male),
                new Person("Alice", Female)
        );
//        Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(Female.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }
        System.out.println("Declarative approach");
//        Declarative approach
        List<Person> females2 =
                people.stream().filter(person -> Female.equals(person.gender)).toList();
        females2.forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender{
            Male,Female
        }
    }
}
