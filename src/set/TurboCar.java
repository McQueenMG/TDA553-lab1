package set;

import java.awt.*;


abstract class TurboCar extends Car{

    private boolean turboOn;

    protected TurboCar(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed, boolean turboOn){
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.turboOn = turboOn;
    }
    double speedFactor() {
        double turbo = 1;
        if (getTurboOn())

            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    protected boolean getTurboOn(){
        return turboOn;
    }
}

