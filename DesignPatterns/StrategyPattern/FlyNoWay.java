package DesignPatterns.StrategyPattern;
/**
 * FlyNoWay
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Does not fly");
    }
}