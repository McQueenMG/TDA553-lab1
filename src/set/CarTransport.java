package set;

import java.awt.Color;

public class CarTransport extends Truck{

    private CarStorage storage;

    public CarTransport(){
        super(2, 100, "Car Transport", Color.red, 0, 0);
        storage = new CarStorage(6, getX(), getY());
    }

    public void changePlatform() {
        if (getCurrentSpeed() == 0) {
            if (getPlatformAngle() == -45){
                setPlatformAngle(0); //Raised
            }else{
                setPlatformAngle(-45); //Lowered
            }
        } else {
            throw new IllegalArgumentException("Can not change the platform while car transport is moving");
        }
    }

    public void loadCar(Car object){
        if (storage.isCarCloseEnoughToStore(object) && getPlatformAngle() == -45){
            storage.loadCar(object);
            object.setX(getX());
            object.setY(getY());
        }else{
            throw new IllegalArgumentException("Car is not close enough to be loaded");
        }
    }

    public void unloadCar(Car object){
        if (getPlatformAngle() == -45){
            storage.unloadCar(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    }
    @Override
    public void move(){
        super.move();
        storage.setPosition(getX(), getY());
    }

    
    double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
