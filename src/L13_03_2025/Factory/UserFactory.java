package L13_03_2025.Factory;

import L13_03_2025.Model.User;

import java.util.List;
import java.util.Random;

public class UserFactory extends User {
    public UserFactory(String name, int age) {
        super(name,age);
    }
    private final static Random rand = new Random();
    private final static List<String> names = List.of("Дима", "Саша", "Рома", "Коля","Сергей");
    public static User next() {
        String name = names.get(rand.nextInt(names.size()));
        int age = rand.nextInt(20,65);
        return new User(name,age);
    }
}
