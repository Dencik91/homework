package transformation;

public class Ice extends Material {

    public Ice() {
    }

    public Ice(int temperature) {
        super(temperature);
    }

    @Override
    public String toString() {
        return "Ice weight=" + getTemperature();
    }
}
