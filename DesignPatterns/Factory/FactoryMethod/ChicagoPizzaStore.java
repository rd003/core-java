package DesignPatterns.Factory.FactoryMethod;


public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
       Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
