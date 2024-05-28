package student.homework.exercise.world;

public class DangerousLiquid extends Liquid {
    private String level;

    public DangerousLiquid () {}

    public DangerousLiquid(String name, int volume, int temperature, String level) {
        super(name, volume, temperature);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return this.getName() + ", DangerousLiquid, toxicity level=" + level;
    }
}
