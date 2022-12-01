package set;

import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, 100, "Volvo240", Color.black, 0);
        stopEngine();
    }

    private double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    double calculateSpeedDecrease(double amount) {
        return Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    double calculateSpeedIncrease(double amount) {
        return Math.max(getCurrentSpeed() + speedFactor() * amount, 0);
    }
}
