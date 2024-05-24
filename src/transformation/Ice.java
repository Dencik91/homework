package transformation;

public class Ice {

    private int weight;

    public Ice() {
    }

    public Ice(int weight) {
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
        return "Ice weight=" + weight;
    }
}
