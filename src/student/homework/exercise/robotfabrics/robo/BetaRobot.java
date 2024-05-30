package student.homework.exercise.robotfabrics.robo;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface{
    private int charge;

    public BetaRobot () {}

    public BetaRobot(String name, String model) {
        super(name, model);
        this.charge = 0;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        if ((charge >=0)&&(charge <= 100)) {
            this.charge = charge;
        } else {
            System.err.println("Charge level can be only between 0 and 100");
        }
    }

    @Override
    public boolean moveRight() {
        if (charge >= 5) {
            this.setCharge(getCharge()-1);
            return super.moveRight();
        } else {
            System.err.println("Low charge");
            return false;
        }
    }

    @Override
    public boolean moveLeft() {
        if (charge >= 5) {
            this.setCharge(getCharge()-1);
            return super.moveLeft();
        } else {
            System.err.println("Low charge");
            return false;
        }
    }

    @Override
    public boolean moveDown() {
        if (charge >= 5) {
            this.setCharge(getCharge()-1);
            return super.moveDown();
        } else {
            System.err.println("Low charge");
            return false;
        }
    }

    @Override
    public boolean moveUp() {
        if (charge >= 5) {
            this.setCharge(getCharge()-1);
            return super.moveUp();
        } else {
            System.err.println("Low charge");
            return false;
        }
    }
}
