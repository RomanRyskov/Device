package Lottotron2.Servises;


import Lottotron2.Model.Participant;
import Lottotron2.exception.NotInitializedException;
import Lottotron2.exception.UnderageException;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private List<T> winners = new ArrayList<>();
    private Queue<T> queue = new LinkedList<>();
    private Boolean initialize = false;
    private int count = 2;

    public int getCount() {
        return count;
    }

    public List<T> getWinners() {
        return winners;
    }

    public void add (T item) throws UnderageException {
        if (!initialize) {
            if (item.getAge() < 18) {
                throw new UnderageException("Участнику меньше 18 лет");
            }
            if (allItems.contains(item)) {
                throw new DuplicateFormatFlagsException("Участник уже с таким паспортом уже имеется");
            }
            allItems.add(item);
        }
    }

    public void init() {
        if (!initialize) {
            initialize = true;
            Collections.shuffle(allItems);
            queue.addAll(allItems);
        }
    }

    public T pick() {
        if (!initialize) {
            init();
        }
        T winner = queue.poll();
        if (winner != null) {
        allItems.remove(winner);
        winners.add(winner);}
        count--;
        return winner;
    }

    public void reset() {
        initialize = false;
        queue.clear();
        init();
        count = 2;
    }

    public int remaining() {
        return queue.size();
    }

    public Map<String, Integer> ageToWinners() {
        Map<String, Integer> map = new HashMap<>(Map.of("18-30 лет", 0, "30-50 лет", 0, "50 и больше", 0));
        for (T winner : winners) {
            int age = winner.getAge();
            if (age < 30) {
                map.put("18-30 лет", map.get("18-30 лет") + 1);
            }
            if (age > 30 && age < 50) {
                map.put("30-50 лет", map.get("30-50 лет") + 1);
            }
            if (age > 50) {
                map.put("50 и больше", map.get("50 и больше") + 1);
            }
        }
        return map;
    }

    public Map<String, Integer> sexToWinnersCount(){
        Map<String, Integer> map = new HashMap<>(Map.of("Мужчина",0,"Женщина",0));
        for (T winner : winners) {
            String gender = winner.getGender();
            map.put(gender, map.get(gender) + 1);
        }
        return map;
    }
}
