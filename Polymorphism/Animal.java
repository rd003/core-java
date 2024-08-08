package Polymorphism;

public abstract class Animal {
    public void sleep() {
        System.out.println("Animal sleep");
    }

    public abstract void eat();
    public abstract void makeNoise();
    public abstract void roam();
}
