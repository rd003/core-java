package DesignPatterns.StrategyPattern;
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quak(); // delegation
    }

    public void performFly() {
        flyBehavior.fly(); // delegation
    }
    
    public void swim() {
        System.out.println("Duck is swimming");
    }

    public abstract void display();
}
