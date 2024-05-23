package student.homework.exercise.w3resource.oopex4;

public class Main {
    public static void main(String[] args) {
        Circle.radius = 10;
        System.out.println("Circle radius = " + Circle.radius);
        System.out.println("Circle Area is = " + (3.14 * Circle.radius * Circle.radius));
    }
}

class Circle {
    public static int radius;
}
