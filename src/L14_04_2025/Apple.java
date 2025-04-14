package L14_04_2025;

public class Apple  {
    private int weight;
    private Color color;

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
