package set;

import java.awt.*;

abstract class Truck extends Car {

    private double platformAngle;

    protected Truck(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed, double platformAngle) {
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.platformAngle = platformAngle;
    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    protected void setPlatformAngle(double platformAngle) {
        this.platformAngle = platformAngle;
    }

    @Override
    public void gas(double amount) {
        if (getPlatformAngle() == 0) {
            super.gas(amount);
        } else {
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }

    @Override
    public void brake(double amount) {
        if (getPlatformAngle() == 0) {
            super.brake(amount);
        } else {
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }
}
