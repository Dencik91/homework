package student.homework.exercise.robotfabrics.robo;

public class AlphaRobot extends AbstractRobot{
    private String name = "Robocop";
    private String model = "Alpha_Robot";
    private int x;
    private int y;

    public AlphaRobot() {
        this.x = 0;
        this.y = 0;
    }

    public AlphaRobot(String name, String model) {
        setName(name);
        setModel(model);
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Can't set null name");
        }
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            System.out.println("Can't set null model");
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        if ((x >=0)&&(x <= 100)) {
            this.x = x;
        } else {
            System.err.println("X can be only between 0 and 100");
        }
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        if ((y >= 0)&&(y <= 100)) {
            this.y = y;
        } else {
            System.err.println("X can be only between 0 and 100");
        }
    }

    public boolean moveRight() {
        if (getX() > 99) {
            return false;
        } else {
            setX(getX()+1);
            return true;
        }
    }

    public boolean moveLeft() {
        if (getX() < 1) {
            return false;
        } else {
            setX(getX()-1);
            return true;
        }
    }

    public boolean moveDown() {
        if (getY() > 99) {
            return false;
        } else {
            setY(getY()+1);
            return true;
        }
    }

    public boolean moveUp() {
        if (getY() < 1) {
            return false;
        } else {
            setY(getY()-1);
            return true;
        }
    }
}
