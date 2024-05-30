package student.homework.exercise.robotfabrics.test;

import student.homework.exercise.robotfabrics.robo.BetaRobot;

public class ChargeTest {
    public static int runCase(BetaRobot robot) {
        int percentage = 0;

        // Test for charge

        //set charge to -100
        robot.setCharge((byte) -100);
        if (robot.getCharge() < 0) {
            System.err.println("Set Charge test failed\nREASON: negative value not allowed!");
            return percentage;
        }
        percentage +=33;

        //set charge to 1000
        robot.setCharge((byte) 1000);
        if (robot.getCharge() > 100) {
            System.err.println("Set Charge test failed\nREASON: value more than 100 not allowed!");
            return percentage;
        }
        percentage +=33;

        //set charge to 50 and move continuously to right, finaly check charge level
        robot.setCharge((byte)50);
        while(true) {
            if (!robot.moveRight()) break;
        }
        if (robot.getCharge() != 4) {
            System.err.println("Charge consuption error\nREASON: value of charge can't be less than 4!");
            return percentage;
        }
        percentage +=34;

        return percentage;
    }
}
