import transformation.Heater;
import transformation.Ice;
import transformation.Material;
import transformation.Water;

public class Main {
    public static void main(String[] args)throws Exception {
        Ice ice = new Ice(-5);
        System.out.println(ice);
        Heater heater = new Heater();
        Material newMaterial = heater.heat(ice, 10);
        System.out.println(newMaterial);
        Material newMaterial2 = heater.cool(newMaterial, 6);
        System.out.println(newMaterial2);
    }
}