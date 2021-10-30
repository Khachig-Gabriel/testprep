package oop.abstraction.interfaces;

/**
 * The BMW I8 car is a hybrid car
 * that's why it should implement 2 interfaces
 */
public class BmwI8 implements BmwCar, ElectricCar{
    @Override
    public void attachLogo() {
        System.out.println("Attaching BMW logo");
    }

    @Override
    public void turnOnAngelLights() {
        System.out.println("Turning on the Angels lights");
    }

    @Override
    public void run() {
        System.out.println("Running the car at 90km/h");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("Filling the tank with fuel");
        System.out.println("Fuel is: " + fuel);
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void emitCO2() {
        System.out.println("Running with 0 emissions");
    }
}
