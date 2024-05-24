package transformation;

public class Ice extends Material {

    public Ice() {
    }

    public Ice(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Ice weight=" + getWeight();
    }
}
