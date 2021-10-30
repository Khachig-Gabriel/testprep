package oop.abstraction.interfaces;

public class InterfacesExample {

    public static void main(String[] args) {
        Car carRef = new BmwI8();
        carRef.run();

        BmwCar bmwCareRef = new BmwI8();
        bmwCareRef.turnOnAngelLights();

        BmwI8 bmwI8Ref = new BmwI8();
        bmwI8Ref.fillTheTank("Gasoline");

        ElectricCar electricCarRef = new BmwI8();
        electricCarRef.emitCO2();

        ElectricCar electricCar = new Tesla();
        electricCar.emitCO2();

        Tesla teslaRef = new Tesla();
        teslaRef.fillTheTank("Electricity");
    }
}
