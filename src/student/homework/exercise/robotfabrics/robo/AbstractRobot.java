package student.homework.exercise.robotfabrics.robo;

public abstract class AbstractRobot implements
        Moveable2DInterface, Has2DCoordinatesInterface {
    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setModel(String model);
    public abstract String getModel();

}
