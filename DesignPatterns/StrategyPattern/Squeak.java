package DesignPatterns.StrategyPattern;
/**
 * Squeak
 */
public class Squeak implements QuackBehaviour {

    @Override
    public void quak() {
        System.out.println("Squeaking...");
    }
}