package L14_04_2025.predicate;

import L14_04_2025.Apple;

import java.util.function.Predicate;

@FunctionalInterface
public interface FruitPredicate <T> {
    boolean test(T t);
}
