package transformation;

public class Water extends Material{

    private int weight;

    public Water() {
    }

    public Water(int weight) {
        super(weight);
    }


    @Override
    public String toString() {
        return "Water weight=" + getWeight();
    }
}
