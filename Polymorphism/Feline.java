package Polymorphism;

public abstract class Feline extends Animal {
    
    @Override
    public void eat() {
        System.out.println("Dog eats");

    }

    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }
    
    public abstract void roam();
}
