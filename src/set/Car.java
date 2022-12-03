package set;

import java.awt.*;

abstract class Car implements Movable {

    private int nrDoors;
    private double enginePower;
    private String modelName;
    private Color color;
    private double currentSpeed;
    private double direction;
    private double x;
    private double y;

    protected Car(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    private void setCurrentSpeed(double currentSpeed) {
        if (currentSpeed <= enginePower && currentSpeed >= 0) {
            this.currentSpeed = currentSpeed;
        } else {
            throw new IllegalArgumentException("Can not set the speed outside the range of 0 - EnginePower");
        }
    }

    private void decrementSpeed(double amount) {
        double speedChange = calculateSpeed(amount);
        if (amount >= 0 && getCurrentSpeed() - speedChange <= enginePower) {
            setCurrentSpeed(getCurrentSpeed() - speedChange);
        } else {
            throw new IllegalArgumentException("Can not decrease the speed any further");
        }
    }

    private void incrementSpeed(double amount) {
        double speedChange = calculateSpeed(amount);
        if (amount >= 0 && getCurrentSpeed() + speedChange <= enginePower) {
            setCurrentSpeed(getCurrentSpeed() + speedChange);
        } else {
            throw new IllegalArgumentException("Can not increase the speed any further due to enginepower");
        }
    }

    public void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("The gas method only accepts values in the interval [0, 1]");
        }
    }

    public void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("The brake method only accepts values in the interval [0, 1]");
        }
    }

    abstract double calculateSpeed(double amount);


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getModelName() {
        return modelName;
    }

    public double getDirection() {
        return direction;
    }

    protected void setDirection(double direction) {
        this.direction = direction;
    }

    protected void setColor(Color clr) {
        color = clr;
    }

    public Color getColor() {
        return color;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
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
