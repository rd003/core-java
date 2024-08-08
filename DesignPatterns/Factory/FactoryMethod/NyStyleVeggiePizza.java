package DesignPatterns.Factory.FactoryMethod;

public class NyStyleVeggiePizza extends Pizza{

    public NyStyleVeggiePizza() {
        name = "Ny style veggie pizza";
        dough = "Thin crust";
        sauce = "Marinara sauce";
        toppings.add("Black olive");
        toppings.add("Baby corn");
        toppings.add("Onion");
        toppings.add("Capsicum");
    }
    
}
