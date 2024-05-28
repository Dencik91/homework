package student.homework.exercise.kitchencup;


import student.homework.exercise.world.Liquid;

public class Cup {
    private Liquid liquid;
    final static int MAX_VOLUME = 600; // in ml
    private final String[] validLiquids = {"Water", "Milk", "Tea", "Beer", "Gasoline"};

    public Cup () {}

    public Cup(Liquid liquid) {
        setLiquid(liquid);
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        if (!isLiquidValid(liquid.getName())) {
            System.out.println("This liquid can't be pour in cup");
        } else {
            this.liquid = liquid;
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
        return "Cup with " + liquid.getName() + ", Volume of cup=" + MAX_VOLUME
                + "ml, " + liquid.getName() + " in cup=" + liquid.getVolume();
    }
}
