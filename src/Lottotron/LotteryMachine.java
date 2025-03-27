package Lottotron;

import java.util.*;

public class LotteryMachine<T> {
    private List<T> allItems = new ArrayList<>();
    private Queue<T> queue = new LinkedList<>(){
    };
    private Boolean initialize = false;

    public void add(T item) {
        if (!initialize) {
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
        return queue.poll();
    }

    public void reset() {
        initialize = true;
        queue.clear();
        init();
    }

    public int remaining() {
        return queue.size();
    }
}
