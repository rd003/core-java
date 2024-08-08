package DesignPatterns.StrategyPattern;
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("I am real mallard duck");
    }
}
