package set;

import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;

    public Saab95() {
        super(2, 125, "Saab95", Color.red, 0);
        turboOn = false;
        stopEngine();
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    private double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    double calculateSpeedDecrease(double amount) {
        return getCurrentSpeed() - speedFactor() * amount;
    }

    double calculateSpeedIncrease(double amount) {
        return getCurrentSpeed() + speedFactor() * amount;
    }
}
