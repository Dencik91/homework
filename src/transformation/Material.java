package transformation;

public abstract class Material {
    private int temperature;
    final int MELT_POINT = 0;

    public Material () {}

    public Material(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }




}
