package student.homework.exercise.robotfabrics.robo;

public class RobotFactory {
    public static AbstractRobot getRobot(String model, String name) {
        switch (model) {
            case "Alpha":
                return new AlphaRobot(name, model);
            case "Beta":
                return new BetaRobot(name, model);
            case "Charlie":
                return new CharlieRobot(name, model);
            default:
                System.err.println("This robot model don't exist");
                return null;
        }
    }
    public static ChargingStation getChargingStation() {
        return new ChargingStation();
    }
}
