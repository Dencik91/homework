package student.homework.exercise.robotfabrics.robo;

public class CharlieRobot extends BetaRobot{

    public CharlieRobot () {}

    public CharlieRobot (String name, String model) {
        super(name, model);
    }
    public boolean moveDownRight() {
        if (this.getCharge() < 5) {
            System.err.println("Low charge");
            return false;
        } else if ((getX()>99) || (getY()>99)) {
            return false;
        } else {
            this.setCharge(getCharge()-1);
            setX(getX()+1);
            setY(getY()+1);
            return true;
        }
    }

    public boolean moveDownLeft() {
        if (this.getCharge() < 5) {
            System.err.println("Low charge");
            return false;
        } else if ((getX()<1) || (getY()>99)) {
            return false;
        } else {
            this.setCharge(getCharge()-1);
            setX(getX()-1);
            setY(getY()+1);
            return true;
        }
    }

    public boolean moveUpRight() {
        if (this.getCharge() < 5) {
            System.err.println("Low charge");
            return false;
        } else if ((getX()>99) || (getY()<1)) {
            return false;
        } else {
            this.setCharge(getCharge()-1);
            setX(getX()+1);
            setY(getY()-1);
            return true;
        }
    }

    public boolean moveUpLeft() {
        if (this.getCharge() < 5) {
            System.err.println("Low charge");
            return false;
        } else if ((getX()<1) || (getY()<1)) {
            return false;
        } else {
            this.setCharge(getCharge()-1);
            setX(getX()-1);
            setY(getY()-1);
            return true;
        }
    }
}
