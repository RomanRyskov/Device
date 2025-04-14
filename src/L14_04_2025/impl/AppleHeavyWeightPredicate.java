package L14_04_2025.impl;

import L14_04_2025.Apple;
import L14_04_2025.predicate.FruitPredicate;

public class AppleHeavyWeightPredicate implements FruitPredicate <Apple>{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
