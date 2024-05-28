package student.homework.exercise.world;

public class DrinkableLiquid extends Liquid {
    private String category;

    public DrinkableLiquid () {}

    public DrinkableLiquid(String name, int volume, int temperature, String category) {
        super(name, volume, temperature);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.getName() + ", DrinkableLiquid, category=" + category;
    }
}
