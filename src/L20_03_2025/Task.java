package L20_03_2025;

public class Task implements  Comparable<Task> {
    private int priority;
    private String title;

    public Task(int priority, String title) {
        this.priority = priority;
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
}
