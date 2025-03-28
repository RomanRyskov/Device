package Lottotron.Servises;


import Lottotron.Model.Participant;

import java.util.*;

public class LotteryMachine<T extends Participant> {
    private List<T> allItems = new ArrayList<>();
    private List<T> winners = new ArrayList<>();
    private Queue<T> queue = new LinkedList<>(){
    };
    private Boolean initialize = false;



    public void add(T item) {
        if (!initialize && item.getAge()>=18) {
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
        T winner = queue.poll();
        if (!initialize) {
            init();
        }
        allItems.remove(winner);
        winners.add(winner);
        return winner;
    }

    public void reset() {
        initialize = false;
        queue.clear();
        init();
    }

    public int remaining() {
        return queue.size();
    }



    /*public Map<String, Integer> ageToWinners(){
        Map<String, Integer> map = new HashMap<>();

    }*/
}
