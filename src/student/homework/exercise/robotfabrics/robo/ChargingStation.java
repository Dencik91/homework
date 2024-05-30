package student.homework.exercise.robotfabrics.robo;

public class ChargingStation implements Has2DCoordinatesInterface, HasBatteryInterface{
    private int charge;
    private int x;
    private int y;

    public ChargingStation () {
        this.charge = 0;
        this.x = 0;
        this.y = 0;
    }

    @Override
    public int getCharge() {
        return charge;
    }

    @Override
    public void setCharge(int charge) {
        if ((charge >=0)&&(charge <= 100)) {
            this.charge = charge;
        } else {
            System.err.println("Charge level can be only between 0 and 100");
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

    public boolean charge(HasBatteryInterface chargeable) {
        if ((((AbstractRobot) chargeable).getX() != this.getX()) ||
                (((AbstractRobot) chargeable).getY() != this.getY()) ||
                (chargeable.getCharge() > 90)) {
            return false;
        }
        while(chargeable.getCharge()<=90) {
            if (getCharge()<5){
                return false;
            } else {
                setCharge(getCharge() - 1);
                chargeable.setCharge(chargeable.getCharge() + 10);
            }
        }
        return true;
    }
}
