package student.homework.exercise.kitchencup;

public class SmallCup extends Cup {

    public SmallCup () {}

    public SmallCup(String liquidName, int liquidVolume) {
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }

    @Override
    public void setLiquidVolume(int liquidVolume) {
        if ((liquidVolume >= 0)&&(liquidVolume <= 250)) {
            this.liquidVolume = liquidVolume;
            System.out.println("Successful pour " + liquidVolume + "ml");
        } else {
            System.out.println("Invalid quantity of liquid");
        }
    }
}
