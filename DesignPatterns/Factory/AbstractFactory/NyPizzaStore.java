package DesignPatterns.Factory.AbstractFactory;

public class NyPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        if(item.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style cheese pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York style clam pizza");
        } 
        // else if (item.equals("veggie")) {
        //     pizza = new VeggiePizza(ingredientFactory);
        //     pizza.setName("New York style veggie pizza");
        // } else if (item.equals("pepperoni")) {
        //     pizza = new PeeperoniPizza(ingredientFactory);
        //     pizza.setName("New York style pepperoni pizza");
        // }
        
        return pizza;
    }
    
}
