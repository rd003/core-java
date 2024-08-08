package DesignPatterns.Factory.FactoryMethod;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "Ny style sauce and cheese pizza";
        dough = "Thin crust";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}

