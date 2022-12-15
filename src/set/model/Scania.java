package set.model;

import java.awt.*;

public class Scania extends Truck{
    
    private double platformAngle;

    public Scania(){
        super(2, 100, "Scania", Color.black, 0);
        this.platformAngle = 0;
        stopEngine();
        setY(100);  
    }
    public double getPlatformAngle(){
        return platformAngle;
    }

    public void changePlatform(double amount) {
        if (amount >= 0 && amount <= 70 && getCurrentSpeed() == 0) {
            platformAngle = amount;
        } else {
            throw new IllegalArgumentException("Can not change the platform any further");
        }
    }

    @Override
    public void gas(double amount){
        if (platformAngle > 0){
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }else{
            super.gas(amount);
        }

    }

    @Override
    public void move(){
        if (platformAngle == 0){
            super.move();
        }else{
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }



    
}
