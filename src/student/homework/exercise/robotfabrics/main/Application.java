package student.homework.exercise.robotfabrics.main;

import student.homework.exercise.robotfabrics.robo.AlphaRobot;
import student.homework.exercise.robotfabrics.test.SimpleTest;

public class Application {
    public static void main(String[] args) {
        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
    }
}
