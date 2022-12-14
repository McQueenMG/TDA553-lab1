package set;

import set.model.*;
import set.GUI.*;

public class CarApp {
    

    public static void main(String[] args){
        ModelAdapter model = new ModelAdapter();
        Volvo240 volvo240 = new Volvo240();
        model.addCar(volvo240);
        Saab95 saab95 = new Saab95();
        model.addCar(saab95);
        Scania scania = new Scania();
        model.addCar(scania);
        
        CarController carController = new CarController(model);

        CarView carView = new CarView("Carm 1.0", carController);
        model.addObserver(carView);
    
    }
}
