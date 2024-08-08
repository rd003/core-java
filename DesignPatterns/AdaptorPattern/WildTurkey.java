package DesignPatterns.AdaptorPattern;

public class WildTurkey implements Turkey {
    public void fly() {
        System.out.println("I'm flying a short distance");
    }

    public void gobble() {
        System.out.println("gobble gobble");
    }
    
}
