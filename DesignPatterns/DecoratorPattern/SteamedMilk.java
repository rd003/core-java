package DesignPatterns.DecoratorPattern;

//decorator
public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    
    public double cost() {
        return beverage.cost() + .10;
    }
}
