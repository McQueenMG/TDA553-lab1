package set;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {

    private List<Car> loadedCars = new ArrayList<>();
    private int maxNumCars;
    private double x;
    private double y;

    public CarStorage(int maxNumCars, double x, double y) {
        this.maxNumCars = maxNumCars;
        this.x = x;
        this.y = y;
    }

    void setPosition(double x, double y){
        this.x = x;
        this.y = y;
        for (int i = 0; i <= getLoadedCars().size()-1; i++) {
            getLoadedCars().get(i).setX(x);
            getLoadedCars().get(i).setY(y);
        }
    }


    public void loadCar(Car object) {
        if (loadedCars.size() < maxNumCars && !object.isCarInStorage()) {
            loadedCars.add(object);
            object.changeCarInStorage();
            object.stopEngine();
        } else {
            throw new IllegalArgumentException("Platform must be lowered or the maximum car capacity has been reached");
        }
    }
    
    public void unloadCar(Car object){
        if (!loadedCars.isEmpty() && object.isCarInStorage()){
            loadedCars.remove(object);
            object.changeCarInStorage();
        }else{
            throw new IllegalArgumentException("That car is not loaded");
        }
    }

    public List<Car> getLoadedCars(){
        return loadedCars;
    }

    public boolean isCarCloseEnoughToStore(Car object){
        double xDiff = x - object.getX();
        double yDiff = y - object.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + (Math.pow(yDiff, 2))) < 4;
    }

}
