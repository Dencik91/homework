package student.homework.exercise.robotfabrics.test;

import student.homework.exercise.robotfabrics.robo.*;

public class ChargeStationTest {
    public static int runCase(ChargingStation station) {
        int percentage = 0;

        //Test for charging station

        //Prepare environment
        station.setX(10);
        station.setY(10);
        station.setCharge(100);
        AbstractRobot rob = RobotFactory.getRobot("Beta", "Rob");
        rob.setX(20);
        rob.setY(20);
        ((BetaRobot) rob).setCharge(50);

        // try to charge rob from another coordinates
        if (station.charge((HasBatteryInterface) rob)) {
            System.err.println("Charging operation is failed\nREASON: can't" +
                    " charge chargeable from another location!");
            return percentage;
        }
        percentage+=25;

        // move robot to station and charge
        for (int i=0; i<10; i++) { rob.moveLeft();}
        for (int i=0; i<10; i++) { rob.moveUp();}
        if (!(station.charge((HasBatteryInterface) rob))) {
            System.err.println("Charging operation is failed\nREASON: can't" +
                    "Station don't charge robot from same location!");
            return percentage;
        }
        percentage+=25;

        // check charge level of robot and station
        if((station.getCharge() != 93) || (((BetaRobot) rob).getCharge() != 100)) {
            System.err.println("Charging operation is failed\nREASON: can't" +
                    "Charge level of station or robot is wrong");
            return percentage;
        }
        percentage+=25;

        // Try to charge again the same robot
        if (station.charge((HasBatteryInterface) rob)) {
            System.err.println("Charging operation is failed\nREASON: can't" +
                    "Can't charge full charged robot");
            return percentage;
        }
        percentage+=25;

        return percentage;
    }
}
