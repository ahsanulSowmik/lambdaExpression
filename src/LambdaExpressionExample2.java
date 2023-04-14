
import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 25));
        people.add(new Person("David", 30));
        people.add(new Person("Eve", 25));
        people.add(new Person("Frank", 35));

        Map<Integer, List<Person>> groupsByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));


        System.out.println(groupsByAge.entrySet());


        List<Map.Entry<Integer, List<Person>>> sortedGroups = new ArrayList<>(groupsByAge.entrySet());

        Collections.sort(sortedGroups, (group1, group2) -> group2.getValue().size() - group1.getValue().size());

        for (Map.Entry<Integer, List<Person>> entry : sortedGroups) {
            System.out.printf("Age %d: %s%n", entry.getKey(), entry.getValue());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name;
    }
}


