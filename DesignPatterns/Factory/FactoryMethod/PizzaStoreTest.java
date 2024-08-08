package DesignPatterns.Factory.FactoryMethod;


public class PizzaStoreTest {
   public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NyPizzaStore();
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

    Pizza pizza = nyPizzaStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    
    Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza2.getName() + "\n");

   }
}
