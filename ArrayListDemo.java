import java.util.ArrayList;

import Abs.Dog;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Rocky", 20));
        dogs.add(new Dog("Jimmy", 30));
        dogs.add(new Dog("Jacky", 40));

        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
