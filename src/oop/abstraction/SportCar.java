package oop.abstraction;

public class SportCar extends Car
{
    @Override
    public void move() {
        System.out.println("Sport car is moving");
    }

    @Override
    public void startEngine() {
        System.out.println("Sport car engine is starting..");
        super.startEngine();
    }
}
