package Abs;

public class Dog extends Animal {
    private int size;

    public Dog(String name, int size) {
        super(name);
        this.size = size;
    }
    
    @Override
    public void Speak() {
      System.out.println(this.getName() + " barks");
    }

    public void Run(String animalName)
    {
        System.out.println(animalName+" runs");
    }
    
   
}
