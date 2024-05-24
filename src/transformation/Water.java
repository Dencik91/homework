package transformation;

public class Water extends Material{

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
