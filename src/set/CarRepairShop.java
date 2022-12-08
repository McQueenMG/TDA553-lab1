package set;

public class CarRepairShop extends Workshop{

    private CarStorage storage; 

    public CarRepairShop(String name, double x, double y, int maxNumCars){
        super(name, x, y);
        storage = new CarStorage(maxNumCars, getX(), getY());
    }

    public void loadCar(Car object){
        if (storage.isCarCloseEnoughToStore(object)){
            storage.loadCar(object);
            object.setX(getX());
            object.setY(getY());
        }else{
            throw new IllegalArgumentException("Car is not close enough to be loaded");
        }
    }

    public void unloadCar(Car object){
        storage.unloadCar(object);
    }
}
