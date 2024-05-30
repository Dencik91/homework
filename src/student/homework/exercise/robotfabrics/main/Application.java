package student.homework.exercise.robotfabrics.main;

import student.homework.exercise.robotfabrics.robo.AlphaRobot;
import student.homework.exercise.robotfabrics.robo.BetaRobot;
import student.homework.exercise.robotfabrics.robo.CharlieRobot;
import student.homework.exercise.robotfabrics.robo.RobotFactory;
import student.homework.exercise.robotfabrics.test.ChargeStationTest;
import student.homework.exercise.robotfabrics.test.ChargeTest;
import student.homework.exercise.robotfabrics.test.DiagonalWalkTest;
import student.homework.exercise.robotfabrics.test.SimpleTest;

public class Application {
    public static void main(String[] args) {
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha")));
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Robo","beta")));
//        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Robocop","beta")));
//        System.out.println("Robot Charlie");
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("Robo","beta")));
//        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase( new CharlieRobot("Robocop","beta")));
//        System.out.printf("Diagonal move test passed %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Rob","beta")));
        System.out.printf("Charging station test passed %d%%\n", ChargeStationTest.runCase(RobotFactory.getChargingStation()));
    }
}
