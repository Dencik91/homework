package transformation;

public class Heater {
    public Material heat(Material material, int deltaHeat) {

        if ((material.getTemperature() + deltaHeat > material.MELT_POINT) &&
                (material.getTemperature()<=material.MELT_POINT)) {
            return new Water(material.getTemperature() + deltaHeat);
        } else {
            material.setTemperature(material.getTemperature() + deltaHeat);
            return material;
        }
    }

    public Material cool(Material material, int deltaCool) {

        if ((material.getTemperature() - deltaCool <= material.MELT_POINT) &&
                (material.getTemperature()>=material.MELT_POINT)) {
            return new Ice(material.getTemperature() - deltaCool);
        } else {
            material.setTemperature(material.getTemperature() - deltaCool);
            return material;
        }
    }
}
