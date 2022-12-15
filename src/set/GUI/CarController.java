package set.GUI;

import set.model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.

    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    ModelAdapter model;
    //methods:

    public CarController(ModelAdapter model) {
        this.model = model;
    }

    public List<Car> getCarsList(){
        return model.getCarsList();
    }

    public void gas(int amount){
        model.gas(amount);
    }
    public void brake(int amount){
        model.brake(amount);
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */



}
