package student.homework.exercise.kitchencup;

import java.util.Arrays;

public class Cup {
    String liquidName;
    int liquidVolume;// in ml
    String[] validLiquids = {"Water", "Milk", "Tea"};

    public Cup () {}

    public Cup(String liquidName, int liquidVolume) {
        this.setLiquidName(liquidName);
        this.setLiquidVolume(liquidVolume);
    }

    public String getLiquidName() {
        return liquidName;
    }

    public void setLiquidName(String liquidName) {
        if (isLiquidValid(liquidName)) {
            this.liquidName = liquidName;
            System.out.println("The cup is for " + liquidName);
        } else {
            System.out.println("The liquid is invalid");
        }
    }

    public int getLiquidVolume() {
        return liquidVolume;
    }

    public void setLiquidVolume(int liquidVolume) {
        if ((liquidVolume >= 0)&&(liquidVolume <= 600)) {
            this.liquidVolume = liquidVolume;
            System.out.println("Successful pour " + liquidVolume + "ml");
        } else {
            System.out.println("Invalid quantity of liquid");
        }
    }

    public boolean isLiquidValid(String liquidName) {
        for (String liquid : validLiquids) {
            if (liquid.equalsIgnoreCase(liquidName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cup with " + liquidName + ", Volume=" + liquidVolume + "ml";
    }
}
