package transformation;

public abstract class Material {
    private int weight;

    public Material () {}

    public Material(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
