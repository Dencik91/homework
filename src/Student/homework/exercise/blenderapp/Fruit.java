package Student.homework.exercise.blenderapp;

abstract public class Fruit {
    int weight;
    int useFull = 0;

    public Fruit() {}

    public Fruit(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    abstract public void printVitamins();

}
