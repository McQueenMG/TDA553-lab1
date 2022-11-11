import java.awt.*;

abstract class Cars {

    private int nrDoors;
    private double enginePower;
    private String modelName;
    private Color color;
    public double currentSpeed;

    public Cars(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setColor(Color clr){
	    color = clr;kuhdossdhasgldgljad
    }

    public Color getColor(){
        return color;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    @Override
    public String toString() {
        return "Cars [nrDoors=" + nrDoors + ", enginePower=" + enginePower + ", modelName=" + modelName + ", color="
                + color + ", currentSpeed=" + currentSpeed + "]";
    }
    
}
