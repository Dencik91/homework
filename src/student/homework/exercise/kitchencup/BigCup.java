package student.homework.exercise.kitchencup;

public class BigCup extends Cup {

    public BigCup () {}

    public BigCup(String liquidName, int liquidVolume) {
        super(liquidName);
        setLiquidVolume(liquidVolume);
    }

    @Override
    public void setLiquidVolume(int liquidVolume) {
        if ((liquidVolume >= 0)&&(liquidVolume <= 1000)) {
            this.liquidVolume = liquidVolume;
            System.out.println("Successful pour " + liquidVolume + "ml");
        } else {
            System.out.println("Invalid quantity of liquid");
        }
    }
}
