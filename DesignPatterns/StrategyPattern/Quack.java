package DesignPatterns.StrategyPattern;
public class Quack implements QuackBehaviour {

    @Override
    public void quak() {
        System.out.println("Quacking...");
    }
}