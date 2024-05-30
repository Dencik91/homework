package student.homework.exercise.robotfabrics.test;

import student.homework.exercise.robotfabrics.robo.CharlieRobot;

public class DiagonalWalkTest {
    public static int runCase(CharlieRobot robot) {
        int percentage = 0;

        // Test for diagonal walk
        robot.setCharge((byte) 90);

        // check move DownRight
        robot.setX(50);
        robot.setY(50);
        if ((!robot.moveDownRight()) || (robot.getX() != 51) || (robot.getY() != 51)) {
            System.err.println("MoveDownRight error\nREASON: coordinates of move don't match");
            return percentage;
        }
        percentage +=25;
        // check move DownLeft
        robot.setX(50);
        robot.setY(50);
        if ((!robot.moveDownLeft()) || (robot.getX() != 49) || (robot.getY() != 51)) {
            System.err.println("MoveDownLeft error\nREASON: coordinates of move don't match");
            return percentage;
        }
        percentage +=25;
        // check move UpRight
        robot.setX(50);
        robot.setY(50);
        if ((!robot.moveUpRight()) || (robot.getX() != 51) || (robot.getY() != 49)) {
            System.err.println("MoveUpRight error\nREASON: coordinates of move don't match");
            return percentage;
        }
        percentage +=25;
        // check move UpLeft
        robot.setX(50);
        robot.setY(50);
        if ((!robot.moveUpLeft()) || (robot.getX() != 49) || (robot.getY() != 49)) {
            System.err.println("MoveUpLeft error\nREASON: coordinates of move don't match");
            return percentage;
        }
        percentage +=25;

        return percentage;

    }
}
