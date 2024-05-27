import transformation.*;

public class Main {
    public static void main(String[] args)throws Exception {
        Water water = new Water(10);
        Nitrogen nitrogen = new Nitrogen(10);
        Heater heater = new Heater();

        Material newWater = heater.cool(water, 15);
        Material newNitrogen = heater.cool(nitrogen, 15);

        System.out.println(newWater);
        System.out.println(newNitrogen);


    }
}