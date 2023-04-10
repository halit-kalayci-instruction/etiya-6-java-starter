package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // Soyut (Abstract) => Direkt olarak newlenemez
        // Car car = new Car(); // HATALI!
        // Somut (Concrete)
        Truck truck = new Truck();
        truck.startEngine();
        truck.move();


        Car car = new Truck();
        car.startEngine();
        car.move();

        Car car2 = new SportCar();
        car2.startEngine();
        car2.move();
    }
}
