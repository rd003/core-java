package DesignPatterns.Factory.FactoryMethod;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
       Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new NyStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NyStyleVeggiePizza();
        } 
        return pizza;
    }
    
}
