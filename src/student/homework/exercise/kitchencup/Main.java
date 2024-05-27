package student.homework.exercise.kitchencup;

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
    }


}
