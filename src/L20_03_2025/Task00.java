package L20_03_2025;

import javax.swing.table.TableRowSorter;
import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Dima");
        queue.offer("Sasha");
        queue.offer("Vova");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("");
        Queue<Task> tasQueue = new PriorityQueue<>();
        tasQueue.offer(new Task(1,"Запустить сервер"));
        tasQueue.offer(new Task(3,"Проверить логи"));
        tasQueue.offer(new Task(2,"Обновить базу данных"));
        System.out.println(tasQueue.poll());
        System.out.println(tasQueue);
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Первый");
        deque.offerFirst("Последний");
    }
}
