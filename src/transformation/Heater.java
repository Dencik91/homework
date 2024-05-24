package transformation;

public class Heater {
    public void heat(Material material) {
        material.setTemperature(material.getTemperature() + 1);
    }

    public void cool(Material material) {
        material.setTemperature(material.getTemperature() - 1);
    }
}
