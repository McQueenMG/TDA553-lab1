package set;

import java.awt.*;

abstract class Cars implements Movable{

    private int nrDoors;
    private double enginePower;
    private String modelName;
    private Color color;
    private double currentSpeed;
    private double direction;
    private double x;
    private double y;

    protected Cars(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
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
    protected void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String getModelName(){
        return modelName;
    }

    public double getDirection(){
        return direction;
    }
    protected void setDirection(double direction){
        this.direction = direction;
    }
    protected void setColor(Color clr){
	    color = clr;
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
    public void move() {
        this.x = (getX() + Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed());
        this.y = (getY() + Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed());
    }

    public void turnLeft() {
        setDirection(getDirection() + 90);
    }

    public void turnRight() {
        setDirection(getDirection() - 90);
    }
}
