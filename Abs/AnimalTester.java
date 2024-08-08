package Abs;

public class AnimalTester {
    public static void main(String[] args)
    {
        Dog d = new Dog("Fido", 14);
        d.Speak();
        d.Run(d.getName());
    }

}
