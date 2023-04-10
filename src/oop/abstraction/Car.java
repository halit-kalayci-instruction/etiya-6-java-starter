package oop.abstraction;
// Abstraction
public abstract class Car {
    String brand;
    String model;
    String color;

    public abstract void move();

    public void startEngine(){
        System.out.println("Starting engine..");
    }
}
