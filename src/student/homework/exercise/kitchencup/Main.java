package student.homework.exercise.kitchencup;

import student.homework.exercise.world.Liquid;

public class Main {
    public static void main(String[] args) {
        Cup cupA = new Cup("Milk", 300);
        Cup cupB = new Cup("Water", 500);

        cupA.setLiquidVolume(250);
        cupB.setLiquidVolume(550);
        System.out.println(cupA);
        System.out.println(cupB);

        SmallCup cupS = new SmallCup("Tea", 200);
        System.out.println(cupS);

        BigCup bigCup = new BigCup("Water", 200);
        bigCup.setLiquidVolume(bigCup.getLiquidVolume() + cupB.getLiquidVolume());
        System.out.println(bigCup);

        Liquid pilk = new Liquid("", 1139, 50);
        System.out.println(pilk);
        Liquid medovuha = new Liquid("Medovuha", 0, -5);
        System.out.println(medovuha);
    }


}
