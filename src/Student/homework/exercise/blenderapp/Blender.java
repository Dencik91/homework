package Student.homework.exercise.blenderapp;

public class Blender {
    public Juice Blend (Fruit fruit) {
        Juice juice = new Juice(fruit.weight * fruit.useFull/100);
        return juice;
    }
}
