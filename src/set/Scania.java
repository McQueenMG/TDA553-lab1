package set;

import java.awt.*;

public class Scania extends Truck{
    

    public Scania(){
        super(2, 100, "Scania", Color.black, 0, 0);
        stopEngine();
    }
    public void changePlatform(double amount) {
        if (amount >= 0 && amount <= 70 && getCurrentSpeed() == 0) {
            setPlatformAngle(amount);
        } else {
            throw new IllegalArgumentException("Can not change the platform any further");
        }
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }
}
