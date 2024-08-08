package Polymorphism;

public class ApplianceTester {
    public static void main(String[] args) {
        Toaster toaster = new Toaster();
        toaster.turnOn(); // works fine
        toaster.turnOn(2); // works fine
    }
}
