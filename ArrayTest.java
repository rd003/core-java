public class ArrayTest {
    public static void main(String[] args) {
        Dog[] pets = new Dog[3];
        Dog fido = new Dog();
        fido.name = "Fido";
        pets[0] = fido;

        Dog michael = new Dog();
        michael.name = "Michael";
        pets[1] = michael;

        Dog kaalo = new Dog();
        kaalo.name = "Kaalo";
        pets[2] = kaalo;
        
        for (int i = 0; i < pets.length;i++) {
            System.out.println(pets[i].name);
        }

    }
}
