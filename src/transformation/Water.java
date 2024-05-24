package transformation;

public class Water {

    private int weight;

    public Water() {
    }

    public Water(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Water weight=" + weight;
    }
}
