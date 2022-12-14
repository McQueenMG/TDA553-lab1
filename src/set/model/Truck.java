package set.model;

import java.awt.*;

abstract class Truck extends Car {


    protected Truck(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed) {
        super(nrDoors, enginePower, modelName, color, currentSpeed);
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }
}
