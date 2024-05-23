package student.homework.exercise.w3resource.oopex2;

public class Main {
    public static void main(String[] args) {

        Dog lucky = new Dog("Lucky", "Husky");
        Dog freddy = new Dog("Freddy", "Taxa");

        System.out.println("Dog name: " + lucky.getName() + ", breed: " + lucky.getBreed());
        System.out.println("Dog name: " + freddy.getName() + ", breed: " + freddy.getBreed());

        System.out.println("Change breed of first dog and name for second dog");
        lucky.setBreed("Pitbul");
        freddy.setName("Apasnii");

        System.out.println("Dog name: " + lucky.getName() + ", breed: " + lucky.getBreed());
        System.out.println("Dog name: " + freddy.getName() + ", breed: " + freddy.getBreed());
    }
}
