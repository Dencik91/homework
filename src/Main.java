import transformation.Heater;
import transformation.Water;

public class Main {
    public static void main(String[] args)throws Exception {
        Water water = new Water(0);
        Heater heater = new Heater();
        for (int i = 0; i<100; i++) {
            heater.heat(water);
        }
        System.out.println(water.getTemperature());
    }
}