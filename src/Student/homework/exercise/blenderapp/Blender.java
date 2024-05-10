package Student.homework.exercise.blenderapp;

public class Blender {
    public Juice blend (Fruit fruit) {
        Juice juice = new Juice(fruit.getWeight() * fruit.useFull/100);
        return juice;
    }
}
