package oop.abstraction.abstract_classes;

public class BmwI8 extends BmwCar {
    @Override
    public void run() {
        System.out.println("Running 90km/h.");
    }

    @Override
    public void fillTheTank(String fuel) {
        System.out.println("Filling the tank with 5l fuel.");
        System.out.println("Fuel is: " + fuel);
    }

    @Override
    public void start() {
        System.out.println("Starting the BMW I8");
    }

    @Override
    public void attachLogo() {
        System.out.println("Attaching BMW logo");
    }

    @Override
    public void turnOnAngelLights() {
        System.out.println("Turning on Angels Lights");
    }
}
