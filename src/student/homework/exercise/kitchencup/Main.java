package student.homework.exercise.kitchencup;

import student.homework.exercise.world.DangerousLiquid;
import student.homework.exercise.world.DrinkableLiquid;
import student.homework.exercise.world.Liquid;

public class Main {
    public static void main(String[] args) {
//       Cup testCup = new Cup(new Liquid("BliuVota", 0, -2));
//       System.out.println(testCup);
       Cup standartCup = new Cup(new Liquid("Water", 500, 22));
       System.out.println(standartCup);
       standartCup.getLiquid().setVolume(standartCup.getLiquid().getVolume()+50);
       System.out.println(standartCup);

       BigCup bigCup = new BigCup(new DrinkableLiquid("Beer", 500, 5, "Soft_Drinks"));
       SmallCup smallCup = new SmallCup(new DangerousLiquid("Gasoline", 100, 11, "Toxic"));
       System.out.println(bigCup);
       System.out.println(bigCup.getLiquid().toString());
       System.out.println(smallCup);
       System.out.println(smallCup.getLiquid().toString());
    }
}
