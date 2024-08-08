package DesignPatterns.StrategyPattern;
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quak() {
        System.out.println("Does not make any sound...");
    }
}