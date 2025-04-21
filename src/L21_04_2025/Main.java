package L21_04_2025;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 650, Type.MEAT),
                new Dish("french fries", true, 350, Type.OTHER),
                new Dish("rice", true, 120, Type.OTHER),
                new Dish("season fruit", true, 800, Type.MEAT),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 420, Type.FISH));

        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                //.limit(3)
                .distinct()
                .collect(Collectors.toList());

        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                //.limit(3)
                .distinct()
                .forEach(System.out::println);
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean isVegatarian = menu.stream().anyMatch(Dish::isVegetarian);
        boolean we = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
        boolean noneMatch = menu.stream().noneMatch(dish -> dish.getCalories() >= 100);

        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();

        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        int i = menu.stream().mapToInt(Dish::getCalories).max().orElse(1);
        Map<Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect1);
    }
}
