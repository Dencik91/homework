package student.homework.exercise.world;

public class Liquid {
    private String name = "Liquid";
    private int volume = 1;  // in ml
    private int temperature;

    public Liquid () {}

    public Liquid(String name, int volume, int temperature) {
        setName(name);
        setVolume(volume);
        setTemperature(temperature);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Liquid name can't be empty, now is set to: " + this.name);
        } else {
            this.name = name;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 0) {
            System.out.println("Volume of liquid can't be 0 or less, now is set to " + this.volume);
        } else {
            this.volume = volume;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if ((temperature <= 0)||(temperature >= 100)) {
            System.out.println("Liquid temperature can't be less than 0C or more than 100C");
        } else {
            this.temperature = temperature;
        }
    }

    public boolean isCold() {
        return this.temperature <= 18;
    }

    public boolean isWarm() {
        return (this.temperature > 18) && (this.temperature <= 36);
    }

    public boolean isHot() {
        return this.temperature > 36;
    }

    @Override
    public String toString() {
        return "Liquid name= " + name + ", volume=" + volume + ", temperature=" + temperature;
    }
}
