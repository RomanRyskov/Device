package Predecate_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Dz {
    public static void main(String[] args) {
        List<String> list = List.of("Дима", "Андрей", "Рома", "Ангелина", "Маргарита");
        List<Integer> num = List.of(22, 17, 55, 44, 113, 85);
        List<String> str = List.of("Привет java", "Привет python","Привет c++","Привет с#");
        List<String> str2 = List.of("Привет"," Пока","????", "*******","222222222");

        boolean result = anyMatch(list, s -> s.startsWith("А"));
        System.out.println("проверка на первую букву А: " + result); //проверка на первую букву А

        boolean result2 = allMatch(num, a -> a > 18);
        System.out.println("проверка что все числа больше 18: " + result2);

        System.out.println(findFirstMatch(str, s -> s.contains("java")));

        System.out.println(filter(str2, s -> s.length() > 5));

    }

    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    public static <T> List<T> findFirstMatch(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static <T> T getFirst(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    public static <T extends Comparable<T>> T min(T first, T second) {
        if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }
        return first.compareTo(second) < 0 ? first : second;
    }

    public static <T extends Comparable<T>> T printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
        return null;
    }

    public static <T extends Comparable<T>> int countOf (List<T> list, T t) {
        int count = 0;
        for (T t1 : list) {
            if (t.equals(t1)) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Comparable<T>> boolean ObjInArray (T[] array, T t) {
        for (T t1 : array) {
            if (t.equals(t1)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> List<T> ArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

    public static <T extends Comparable<T>> void copyList(List<T> list, List<T> dest) {
        list.removeAll(dest);
        list.addAll(dest);
    }

    public static <T extends Comparable<T>> int findIndex(List<T> list, T t) {
        if(!list.contains(t)){
            return -1;
        }
        return list.indexOf(t);
    }

    public static <T extends Comparable<T>> void addList(List<T> list, List<T> dest) {
        list.addAll(dest);
    }
}
