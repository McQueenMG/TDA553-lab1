package set.GUI;

import java.util.ArrayList;
import java.util.List;

import set.model.*;

public class ModelAdapter {

    List<Car> cars = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public ModelAdapter() {

    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public List<Car> getCars() {
        return cars;
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : cars) {
            car.gas(gas);
        }
    }

    void brake(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : cars) {
            car.brake(gas);
        }
    }

    public void update() {

    }

}
