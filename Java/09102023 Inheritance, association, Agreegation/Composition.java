class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine started.");
    }

    public void stop() {
        System.out.println(type + " engine stopped.");
    }

    @Override
    public String toString() {
        return type;
    }
}

class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car is starting...");
        engine.start();
    }

    public void stop() {
        System.out.println("Car is stopping...");
        engine.stop();
    }

    public void displayInfo() {
        System.out.println("Car: " + make + " " + model);
        System.out.println("Engine type: " + engine);
    }
}

public class Composition {
    public static void main(String[] args) {
        Engine f1engine
         = new Engine("V6");
        Car myCar = new Car("hyundai", "eon", f1engine);

        myCar.displayInfo();
        myCar.start();
        myCar.stop();
    }
}