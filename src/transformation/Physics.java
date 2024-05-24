package transformation;

public class Physics {
// kind a design transform pattern
    public static Ice cool(Water water) {
        return new Ice(water.getWeight());
    }

    public static Water heat(Ice ice) {
        return new Water(ice.getWeight());
    }
}
