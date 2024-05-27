package transformation;

public class Nitrogen extends Material{

    public Nitrogen () {}

    public Nitrogen(int temperature) {
        super(temperature);
    }

    @Override
    public String toString() {
        return "Nitrogen temperature=" + getTemperature();
    }
}
