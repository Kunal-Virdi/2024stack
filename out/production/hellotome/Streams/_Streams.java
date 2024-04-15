package Streams;

import java.util.List;
import java.util.function.Predicate;

import static Streams._Streams.Person.Gender.*;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Male),
                new Person("Maria", Female),
                new Person("Alisha", Female),
                new Person("Alex", Male),
                new Person("Bob", Prefer_Not_to_Say)
        );
//        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length; also = name -> name.length;
//        IntConsumer println = System.out::println;
//
//        people.stream().map(personStringFunction).mapToInt(length)
//                .forEach(println);
//        people.stream().map(person -> person.name).mapToInt(String::length)
//                .forEach(System.out::println);
        Predicate<Person> personPredicate = person -> Female.equals(person.gender);

        boolean containOnlyFemales = people.stream().allMatch(personPredicate);//true only when all females
        boolean containAnyFemales = people.stream().anyMatch(personPredicate); // true if any female found
        boolean containNoCustom = people.stream().noneMatch(person ->
                Prefer_Not_to_Say.equals(person.gender)); // true if no prefer not to say found

        System.out.println(containOnlyFemales);
        System.out.println(containAnyFemales);
    }
    static class Person{
        private final String name;
        private final Person.Gender gender;

        Person(String name, Person.Gender gender){
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
            Male,Female,Prefer_Not_to_Say
        }
    }
}
