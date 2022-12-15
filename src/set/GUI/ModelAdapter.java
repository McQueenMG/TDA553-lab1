package set.GUI;


import set.model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ModelAdapter {

    List<Car> cars = new ArrayList<>();
    
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    public CarView frame;


    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : cars) {
                car.move();
                frame.update(car);
            }
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }



    public List<Car> getCarsList() {
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

    public void startTimer() {
        timer.start();
    }

}
