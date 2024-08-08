package DesignPatterns.Factory.AbstractFactory;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void Prepare();  // here we will collect the ingredients
    
    void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slieces");
    }

    void box() {
        System.out.println("Place pizza in the official pizza store box");
    }

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String ToString(){
        return "Pizza: " + name + "is being prepared";
    }
    
    
}
