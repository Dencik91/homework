package transformation;

public class Water extends Material{

    public Water() {
    }

    public Water(int temperature) {
        super(temperature);
    }

    @Override
    public String toString() {
        return "Water weight=" + getTemperature();
    }
}
