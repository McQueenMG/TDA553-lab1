package set;

import java.awt.*;

public class Saab95 extends Cars{

    public boolean turboOn;
    
    public Saab95(){
        super(2, 125, "Saab95", Color.red, 0);
	    turboOn = false;
        stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        
        if ((getCurrentSpeed() + speedFactor() * amount) < getEnginePower()) {
            setCurrentSpeed((getCurrentSpeed() + speedFactor() * amount));
        }else{
            throw new IllegalArgumentException("Can not increase the speed any further due to enginepower");
        }
    }

    public void decrementSpeed(double amount){
        if ((getCurrentSpeed() + speedFactor() * amount) > 0) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }else{
            throw new IllegalArgumentException("Can not decrease the speed any less than 0");
        }
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount < 0 && amount > 1){
            incrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The gas method only accepts values in the interval [0, 1]");
        }
    } 
    

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount > 0 && amount < 1){
            decrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The brake method only accepts values in the interval [0, 1]");
        }
    }
}
