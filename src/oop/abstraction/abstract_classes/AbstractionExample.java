package oop.abstraction.abstract_classes;

import oop.abstraction.abstract_classes.AbstractCar;
import oop.abstraction.abstract_classes.BmwI8;
import oop.abstraction.abstract_classes.Tesla;

public class AbstractionExample {

    public static void main(String[] args) {
        AbstractCar abstractCarReference = new BmwI8();
        abstractCarReference.start();

        Tesla teslaRef = new Tesla();
        teslaRef.run();
        teslaRef.emitCO2();
        teslaRef.run();

    }
}
