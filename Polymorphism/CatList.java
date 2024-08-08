package Polymorphism;

public class CatList {
    private Cat[] cats = new Cat[5];
    private int nextIndex = 0;
    
    public void add(Cat c){
        if(nextIndex<cats.length){
            cats[nextIndex] = c;
            System.out.println("Cat added at index: " + nextIndex);
            nextIndex++;
        }
    }
}
