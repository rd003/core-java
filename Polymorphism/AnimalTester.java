package Polymorphism;

public class AnimalTester {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.roam();
        dog.eat();
        dog.sleep();
        dog.makeNoise();;
    }
}
