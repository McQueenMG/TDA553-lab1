package set.model;

import java.awt.Color;

public class CarTransport extends Truck{

    private CarStorage storage;
    private Boolean rampRaised;

    public CarTransport(){
        super(2, 100, "Car Transport", Color.red, 0);
        storage = new CarStorage(6, getX(), getY());
        this.rampRaised = true;
    }

    public Boolean getRampRaised(){
        return rampRaised;
    }

    public void changePlatform() {
        if (getCurrentSpeed() == 0) {
            this.rampRaised = !rampRaised;
        } else {
            throw new IllegalArgumentException("Can not change the platform while car transport is moving");
        }
    }

    public void loadCar(Car object){
        if (storage.isCarCloseEnoughToStore(object) && !rampRaised){
            storage.loadCar(object);
            object.setX(getX());
            object.setY(getY());
        }else{
            throw new IllegalArgumentException("Car is not close enough to be loaded");
        }
    }

    public void unloadCar(Car object){
        if (!rampRaised){
            storage.unloadCar(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    }

    @Override
    public void gas(double amount){
        if (rampRaised){
            super.gas(amount);
        }else{
            throw new IllegalArgumentException("Can not increase speed while ramp is lowered");
        }
    }
    
    @Override
    public void move(){
        if (rampRaised){
            super.move();
            storage.setPosition(getX(), getY());
        }else{
            throw new IllegalArgumentException("Can not move while the ramp is lowered");
        }
    }

}
