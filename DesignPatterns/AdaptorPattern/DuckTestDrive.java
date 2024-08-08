package DesignPatterns.AdaptorPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("turkey says..");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n Duck says..");
        testDuck(duck);

        System.out.println("\n Turky adaptor says");
        testDuck(turkeyAdaptor);
    }

    private static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
