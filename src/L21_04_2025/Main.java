package L21_04_2025;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

        List<Dish> menu2 = Arrays.asList(
                new Dish("pork2", false, 800, Type.MEAT),
                new Dish("beef2", false, 700, Type.MEAT),
                new Dish("chicken2", false, 750, Type.MEAT),
                new Dish("rice2", true, 120, Type.OTHER),
                new Dish("season fruit2", true, 800, Type.MEAT),
                new Dish("pizza2", true, 550, Type.OTHER),
                new Dish("prawns2", false, 100, Type.FISH),
                new Dish("salmon2", false, 430, Type.FISH),
                new Dish("salmon2", false, 420, Type.FISH));

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

        List<List<Dish>> listList = List.of(menu, menu2);
        List<Dish> collect2 = listList.stream()
                .map(Collection::stream)
                .flatMap(Stream::distinct)
                .collect(Collectors.toList());
        List<Dish> collect3 = listList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum1 = Arrays.stream(nums).sum();

        Dish nullDish = null;
        Stream.of("home", "java", "dish", "javascript")
                .map(String::toUpperCase).forEach(System.out::println);
        Stream.ofNullable(nullDish)
                .map(Dish::getCalories)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        String strDishName = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(", "));
        System.out.println(strDishName);

        menu.stream()
                .map(Dish::getName)
                .collect(Collectors.counting());

        Optional<Dish> collect4 = menu.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));

        Integer collect5 = menu.stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        Double collect6 = menu.stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        IntSummaryStatistics collect7 = menu.stream()
                .collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(collect7);

        int sum2 = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        Map<String, List<Dish>> collect8 = menu.stream()
                .collect(Collectors.groupingBy((Dish::getName)));

        Map<String, List<Dish>> collect9 = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "Диета";
            } else if (dish.getCalories() <= 700) {
                return "Норма";
            } else {
                return "ТОЛСТЫй";
            }
        }));

        Map<Type, List<Dish>> collect10 = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect10);

        Map<Type, List<Dish>> collect11 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.filtering(dish -> dish.getCalories() > 500, Collectors.toList())));
        System.out.println(collect11);

        Map<Type, Long> collect12 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(collect12);

        Map<Type, Dish> mapDish = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
                        Optional::get)));
    }
}
