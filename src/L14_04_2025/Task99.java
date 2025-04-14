package L14_04_2025;

import L14_04_2025.predicate.FruitPredicate;

import java.util.ArrayList;
import java.util.List;

public class Task99 {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5);

        filter2(num, (Integer n) -> n % 2 == 0);

        List<Apple> apples = List.of(new Apple(10, Color.GOLD),
                new Apple(20, Color.RED),
                new Apple(40, Color.ORANGE),
                new Apple(25, Color.RED));


        filter2(apples, (apple -> Color.RED.equals(apple.getColor())));
    }

    private static List<Apple> filterColorApples(List<Apple> apples, Color color) {
        List<Apple> ap = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColor())) {
                ap.add(apple);
            }
        }
        return ap;
    }

    private static List<Apple> filterByWeight(List<Apple> apples, int weight) {
        List<Apple> appleWeight = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                appleWeight.add(apple);
            }
        }
        return appleWeight;
    }

    private static List<Apple> filter(Boolean flag, List<Apple> apples, int weight, Color color) {
        if (flag) {
            filterColorApples(apples, color);
        } else {
            filterByWeight(apples, weight);
        }
        return apples;
    }

    private static <T> List<T> filter2(List<T> fruit, FruitPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : fruit) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }


}