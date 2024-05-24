import transformation.Ice;
import transformation.Physics;
import transformation.Water;

public class Main {
    public static void main(String[] args)throws Exception {
       // System.out.println(new Ice(500).heat().cool()); // chainning method call

        System.out.println(Physics.cool( Physics.heat(new Ice(500))));
    }
}