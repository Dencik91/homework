package Student.homework.exercise.blenderapp;

abstract public class Fruit {
    public int weight;
    int useFull = 0;

    public Fruit() {}

    public Fruit(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
