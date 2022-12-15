package set;

import set.model.*;
import set.GUI.*;

public class CarApp {
    

    public static void main(String[] args){
        ModelAdapter model = new ModelAdapter();
        model.addCar(new Volvo240());
        model.addCar(new Scania());
        model.addCar(new Saab95());
        CarController carController = new CarController(model);
        model.frame = new CarView("Carm 1.0", carController);
        
        model.startTimer();

    }
}
