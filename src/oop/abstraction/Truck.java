package oop.abstraction;

public class Truck extends Car
{
    @Override
    public void move() {
        System.out.println("Truck is moving...");
    }

    // Polymorphism
    @Override
    public void startEngine(){
        System.out.println("Truck engine is starting");
    }
}
