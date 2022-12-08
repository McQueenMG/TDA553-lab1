package set;
import java.awt.*;

abstract class TrimCar extends Car{

    private final double trimFactor;

    protected TrimCar(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed, double trimFactor){
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.trimFactor = trimFactor;
    }

    double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }
}
