package Composition;

public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Car(String engineType,int wheelSize) {
        this.engine = new Engine(engineType);
        this.wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            this.wheels[i]= new Wheel(wheelSize);
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void displayDetails() {
        System.out.println("Car Engine Type: " + engine.getType());
        System.out.println("Wheel Size: " + wheels[0].getSize());
    }
}
