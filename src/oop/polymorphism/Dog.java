package oop.polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // Dynamic Polymorphism example
   @Override
    public void voice() {
        System.out.println("Wuf");
    }
}
